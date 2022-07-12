package Introduction.excercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HappyPathE2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1000075142\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	//	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='ATQ']")).click();;
		
		//FIRST DROPDOWN
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		
		//Add passengers
				driver.findElement(By.id("divpaxinfo")).click();
				Thread.sleep(2000);
				for(int i=1; i < 4; i++) {
					driver.findElement(By.id("hrefIncAdt")).click();
				}
				Thread.sleep(2000);
				
				//divpaxinfo
				//hrefIncAdt
				//btnclosepaxoption
		
		//Click on the checkbox to activate the calendar destination
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(1000);
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		}
		
		
		//activate checkbox
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		
		
		//Autosugestive
		driver.findElement(By.id("autosuggest")).sendKeys("India");
		List<WebElement> options = (List<WebElement>) driver.findElements(By.cssSelector("li[class='ui-corner-all'] a"));
		for (WebElement option : options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		Thread.sleep(2000);
		
		//Dropdowns
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		Thread.sleep(2000);
		dropdown.selectByValue("AED");
		System.out.println("\n" +dropdown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		//make the search
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		System.out.println("FINISHED");
	}

}
