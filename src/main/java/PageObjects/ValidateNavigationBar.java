package PageObjects;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.slf4j.spi.LocationAwareLogger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;

public class ValidateNavigationBar extends base {
	private static final Logger logger = LogManager.getLogger(ValidateNavigationBar.class);

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		logger.info("Url initialized");
	}
	
	@Test
	public void getTest() {
		LandingPage page = new LandingPage(driver);
		page.getTitle();
		logger.info("Text message validated");
	}
	
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
