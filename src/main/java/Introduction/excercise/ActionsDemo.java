package Introduction.excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1000075142\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		Actions act = new Actions(driver);
		
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		//act.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList\']"))).build().perform();
	
		
		//act.moveToElement(driver.findElement(By.id("twotabssearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello");
		
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
		
		act.moveToElement(move).click().build().perform();
		//moves to specific element
		act.moveToElement(move).contextClick().build().perform();
		//drap an down
		
		
		
		
		
		
		
	}

}
