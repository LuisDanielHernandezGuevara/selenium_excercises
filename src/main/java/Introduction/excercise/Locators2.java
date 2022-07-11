package Introduction.excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//driver.findElement(By.id("inputUsername")).sendKeys("rahul");;
		//driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		//driver.findElement(By.className("signInBtn")).click();
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\1000075142\\\\Documents\\\\chromedriver.exe");
		
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]")).sendKeys("John");;
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]")).sendKeys("john@gmail.com");;
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[3]")).sendKeys("9864353253");;
		//driver.findElement(By.cssSelector("#container > div.form-container.sign-up-container > form > input[type=text]:nth-child(4)")).sendKeys("12346243");;
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		System.out.println("\n "+driver.findElement(By.cssSelector("p.infoMsg")).getText());
		//driver.findElement(By.xpath("#container > div.form-container.sign-up-container > form > input[type=text]:nth-child(4)")).clear();
		driver.findElement(By.className("go-to-login-btn")).click();
		
		
		//Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		//driver.findElement(By.cssSelector(""));
		//Assert.assertEquals(driver.findElement(By.cssSelector("login-container")),"Hello rahul,");
				
		//driver.findElement(By.cssSelector(".logout-btn")).click();
		//driver.close();

	}

}
