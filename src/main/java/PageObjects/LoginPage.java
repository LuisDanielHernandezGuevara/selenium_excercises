package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(css="")
	WebElement user;
	
	@FindBy(css="")
	WebElement password;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getUser() {
		return user;
	}
	
	public WebElement getPassword() {
		return password;
	}
}
