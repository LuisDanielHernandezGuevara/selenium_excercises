package Introduction.excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String text = "Rahul";
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\1000075142\\\\Documents\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(text);
		
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		Thread.sleep(3000);

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);

		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);

		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
