package Introduction.excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1000075142\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		//Initial array that needs to be casted --------
		String[] itemsNeeded = {"Cucumber","Brocoli","Setroot"};
		
		List<WebElement> products = (List<WebElement>) driver.findElements(By.cssSelector("h4.product-name"));
		
		//Iterate elements found in web page with selectors repeated
		for(int i =0; i < products.size(); i++) {
			
			//has elements no formatted (ha4.product-name)
			System.out.println("\n Products:"+ products);
			
			String [] name = products.get(i).getText().split("-");
			System.out.println("\n Name: "+ name);
			
			String formattedName = name[0].trim();
			System.out.println("\n formattedName:"+formattedName);
		
			//Cast itemsNeeded into anArrayList ----------
		List itemsNeededList = Arrays.asList(itemsNeeded);
		
		
			System.out.println("\n"+itemsNeededList);
		int j=0;
		if(itemsNeededList.contains(name)) {
			
			//click on add to cart
			j++;
			Thread.sleep(2000);

			//driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if(j==itemsNeeded.length) {
				break;
			}
		}
		}
	}

}
