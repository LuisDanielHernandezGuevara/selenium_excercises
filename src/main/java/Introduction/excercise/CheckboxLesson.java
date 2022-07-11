package Introduction.excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class CheckboxLesson {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1000075142\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//driver.findElement(By.id("ctl00_mainContent_txt_Fromdate")).click();
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_IndArm']")).isSelected();
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_IndArm']")).click();;
		
		//driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected();
		//driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		
		
	}

}
