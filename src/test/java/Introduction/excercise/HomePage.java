package Introduction.excercise;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.base;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import PageObjects.ValidateNavigationBar;

@Test
public class HomePage extends base{
	private static final Logger logger = LogManager.getLogger(ValidateNavigationBar.class);
	public Properties prop;
		@Test(dataProvider="getData")
		
	public void basePageNavigation(String Username, String password)  throws IOException{
			 prop = new Properties();
		
			 driver = initializeDriver();
			 driver.get(prop.getProperty("url"));
		
		LandingPage page = new LandingPage(driver);
		 

		page.getLogin().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.getUser().sendKeys(Username);
		lp.getPassword().sendKeys(password);
		WebElement LandingTitle= page.getTitle();
		logger.info(LandingTitle);
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[1][2];
		//0row
		data[0][0] = "mail@mymail.com";
		data[0][1] = "12344";
		//1strow
		data[0][0] = "mail@mymail.com";
		data[0][1] = "12344";
	
		return data;
	}
	
	
}
