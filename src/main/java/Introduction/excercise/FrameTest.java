package Introduction.excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1000075142\\Documents\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("http://jqueryui.com/droppable/");
		
		System.out.println(d.findElements(By.tagName("iframe")).size());
		d.switchTo().frame(d.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		Actions a = new Actions(d);
		
		WebElement source = d.findElement(By.id("draggable"));
		
		WebElement target = d.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		d.switchTo().defaultContent();
	}

}
