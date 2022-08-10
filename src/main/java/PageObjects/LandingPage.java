package PageObjects;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
	
public class LandingPage {
		
	public WebDriver driver;

	
	@FindBy(css="")
	WebElement login;
	
	@FindBy(css="")
	WebElement title;
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getLogin() {
		return login;
	}
	public WebElement getTitle() {
		return title;
	}
}
