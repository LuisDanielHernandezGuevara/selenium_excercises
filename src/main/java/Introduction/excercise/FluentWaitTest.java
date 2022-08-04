package Introduction.excercise;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1000075142\\\\Documents\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://automationpractice.com/index.php");
    	
    	
    	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
    			.withTimeout(Duration.ofSeconds(30))
    			.pollingEvery(Duration.ofSeconds(3))
    			.ignoring(NoSuchElementException.class);
    	
    	WebElement foo = wait.until(new Function<WebDriver, WebElement>(){
    		public WebElement apply(WebDriver driver) {
    			return driver.findElement(By.id(""));
    		}
    	});
	}

}
