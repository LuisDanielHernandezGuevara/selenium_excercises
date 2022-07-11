package Introduction.excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\1000075142\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		

		String password = getPassword(driver);
		String name ="rahul";

		//driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println("\n "+driver.findElement(By.cssSelector("p.infoMsg")).getText());

			///returns to login in btn
		driver.findElement(By.className("go-to-login-btn")).click();
		
		//sends username and pass
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		Thread.sleep(1000);
		
		//selects checkboxex
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		
		//clicks the sign in button
		driver.findElement(By.className("signInBtn")).click();
		System.out.print(driver.findElement(By.tagName("p")).getText());

			
		
	}
	
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		//neded thread sleep to give a space between click and other action
		
		//Click on reset buton
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//gets text when a password is created
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		
		System.out.println(passwordText);
		String [] passwordArray = passwordText.split("'");
		String password = passwordArray[1].split("'")[0];
		Thread.sleep(2000);
		return password;
		
		
	}

}
