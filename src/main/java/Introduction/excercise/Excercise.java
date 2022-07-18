package Introduction.excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\1000075142\\Documents\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
				driver.findElement(By.id("checkBoxOption2")).click();
				String text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/fieldset/label[2]/input")).getText();
				System.out.print(text);
				
			//	Select select = new Select();
				
				

				

	}

}
