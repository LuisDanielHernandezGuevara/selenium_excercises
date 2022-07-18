package Introduction.excercise;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1000075142\\Documents\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://qaclickacademy.com/practice.php");
		
	//give me the count of links the page
		
		System.out.println(d.findElements(By.tagName("a")).size());
		
		
		WebElement footerdriver = d.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
	//3 
		WebElement columnDriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.print(columnDriver.findElements(By.tagName("a")).size());
		
	//4. Click on each link in the column nand check if the page are openning 
		for(int i = 0; i<columnDriver.findElements(By.tagName("a")).size();i++) {
			String clickonlinkTab =Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000);
			
		}
		//get every tab contained in the link 
		Set<String> abc = d.getWindowHandles();
		
		Iterator<String> it = abc.iterator();
		
		//iterate every link and open tabs
		while(it.hasNext()) {
			d.switchTo().window(it.next());
			System.out.println(d.getTitle());
		}
		
		d.close();
	}

}
