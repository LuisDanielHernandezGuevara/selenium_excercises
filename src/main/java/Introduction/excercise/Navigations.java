package Introduction.excercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\1000075142\\\\Documents\\\\chromedriver.exe");
		driver.get("http://google.com");
		driver.navigate().to("https://github.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		
		
	}

}
