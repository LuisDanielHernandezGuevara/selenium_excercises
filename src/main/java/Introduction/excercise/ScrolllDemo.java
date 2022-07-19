package Introduction.excercise;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrolllDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1000075142\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		int sum = 0;
	List<WebElement> values= driver.findElements(By.cssSelector("#product > tbody > tr:nth-child(1) > td:nth-child(4)"));
	
	for (int i =0; i<values.size(); i++) {
		sum = sum + Integer.parseInt(values.get(i).getText());
		System.out.print(sum);
	}
	
	System.out.print(sum);
	driver.findElement(By.cssSelector(".totalAmount")).getText();
	int total = Integer.parseInt(driver.findElement(By.cssSelector("totalAmount")).getText().split(":")[1].trim());
	
	Assert.assertEquals(sum , total);
	}

}
