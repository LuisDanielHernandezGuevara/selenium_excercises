package Introduction.excercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//HAPPY PATH WHEN A USER LOGS IN 

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1000075142\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//implicity wait - 5seconds time ouut		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String  password =getPassword(driver);
		//driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//driver.findElement(By.id("inputUsername")).sendKeys("rahul");;
		//driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		//driver.findElement(By.className("signInBtn")).click();
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		//String password = getPassword(driver);
		//System.out.println("\n "+driver.findElement(By.cssSelector("p.error")).getText());
		//Thread.sleep(2000);

		/*driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]")).sendKeys("John");;
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]")).sendKeys("john@gmail.com");;
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[3]")).sendKeys("9864353253");;
		//driver.findElement(By.cssSelector("#container > div.form-container.sign-up-container > form > input[type=text]:nth-child(4)")).sendKeys("12346243");;
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();*/
		
		
		System.out.println("\n "+driver.findElement(By.cssSelector("p.infoMsg")).getText());
		//driver.findElement(By.xpath("#container > div.form-container.sign-up-container > form > input[type=text]:nth-child(4)")).clear();
		
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");;
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.print(driver.findElement(By.tagName("p")).getText());
		
		driver.close();
		//Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		//driver.findElement(By.cssSelector(""));
		//Assert.assertEquals(driver.findElement(By.cssSelector("login-container")),"Hello rahul,");
		
		//driver.findElement(By.cssSelector(".logout-btn")).click();
		//driver.close();
	}
	
	
	public static String getPassword(WebDriver driver) throws InterruptedException{
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		
		/*driver.findElement(By.id("inputUsername")).sendKeys("rahul");;
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();*/
		
		System.out.print("Thi is password text:   "+passwordText);
		String [] passwordArray = passwordText.split("'");
		Thread.sleep(2000);
		
		for(int i=0; i <passwordArray.length; i++) {
			System.out.print("Array password " + passwordArray[i]);
		}
		
		String password = passwordArray[1].split("'")[0];
		
		System.out.print("Result: "+password);
		/*Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("login-container")).getText(),"Hello rahul," );
		*/
		return password;
		//driver.findElement(By.cssSelector(".logout-btn")).click();
		
		//driver.close();
	}

}
