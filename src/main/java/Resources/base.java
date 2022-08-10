package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		String path = "C:\\Users\\1000075142\\eclipse-workspace\\Exercises\\src\\main\\java\\Framework\\data.properties";
		Properties prop= new Properties();
		FileInputStream file = new FileInputStream(path);
		
		prop.load(file);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\1000075142\\Documents\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browserName=="firefox") {
			driver = new FirefoxDriver();
		}else if(browserName=="IE") {
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		return driver;
	}

}
