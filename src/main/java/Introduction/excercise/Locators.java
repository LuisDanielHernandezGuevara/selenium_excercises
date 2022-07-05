package Introduction.excercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//implicity wait - 5seconds time ouut
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1000075142\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");;
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		System.out.print(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]")).sendKeys("Luis");;
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]")).sendKeys("Daniel");;
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[3]")).sendKeys("1412412");;
		driver.findElement(By.cssSelector("#container > div.form-container.sign-up-container > form > input[type=text]:nth-child(4)")).sendKeys("12346243");;
		
		//driver.findElement(By.xpath("#container > div.form-container.sign-up-container > form > input[type=text]:nth-child(4)")).clear();
		
		
		
	
	}

}
