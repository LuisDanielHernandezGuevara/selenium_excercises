package Introduction.excercise;

import java.util.Optional;

import org.asynchttpclient.Request;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v103.network.Network;

public class NetworkLogActivity {
	public static void main (String [] args) {
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(), Optional.empty(),  Optional.empty()));
	
		devTools.addListener(Network.requestWillBeSent(), req -> {
			Request req = Request.getRequest();
			System.out.println(req.getUrl());
		});
	
		devTools.addListener(Network.responseReceived(), response ->{
			Response res = response.getResponse();
			System.out.println(res.getStatus());
					
		});
		
	}
}
