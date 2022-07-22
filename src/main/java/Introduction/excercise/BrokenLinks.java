package Introduction.excercise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1000075142\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//Broken urls
		//Step 1 // IS to get all urls tied up tot he links using selenium
		//Java methods code >400 then that url is not working -> link which tied to url is broken
		//a[href="="soapui"]'
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//throws a 202
		//String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		
		//throws a 404
		//String url1 = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");

		
		List<WebElement> elems= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		for(WebElement elem : elems ) {
			
			String url = elem.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			if(respCode>400) {
				System.out.println("The link with text" + elem.getText()+ "is broken with" + respCode);
			}
		}
		
		driver.close();
	
	
	}

}
