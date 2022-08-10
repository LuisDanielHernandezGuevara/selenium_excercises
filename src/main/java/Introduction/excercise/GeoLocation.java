package Introduction.excercise;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class GeoLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		
		Map<String , Object> coordinates = 
				new HashMap<String , Object>();
		
		coordinates.put("latitude", 17);
		coordinates.put("",78);
		coordinates.put("accuracy",1);
		
		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		driver.get("http://google.com");
		driver.findElement(By.cssSelector("LC20lb")).get(0).click();
		String title = driver.findElement(By.cssSelector(".our-sroty-card-title")).getText();
		System.out.println(title);
	}

}
