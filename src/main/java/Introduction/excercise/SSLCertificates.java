package Introduction.excercise;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCertificates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);
	
			Map<String,Object> prefs = new HashMap<String,Object>();
			options.setExperimentalOption("prefs", prefs);
			
			
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1000075142\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://expired/badssl.com/");
		System.out.println(driver.getTitle());
		
		
				}

}
