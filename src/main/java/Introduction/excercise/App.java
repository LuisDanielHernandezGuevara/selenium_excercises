package Introduction.excercise;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //Chrome = ChromeDriver -> Methods close get
        //Firefox - FirefoxDriver -> Methods close get
        //SafariDriver -> Methods close 
        
        //WebDriver close get
        //WebDriver methods + class methods
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\1000075142\\Documents\\chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\1000075142\\Documents\\geckodriver.exe");
        WebDriver firefox = new FirefoxDriver();
        
        System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\1000075142\\\\Documents\\\\geckodriver.exe");
        WebDriver edge = new EdgeDriver();
        
        chrome.get("https://github.com/");
        chrome.getTitle();
        System.out.print(chrome.getCurrentUrl());
        System.out.print(chrome.getTitle());
        System.out.print(chrome.getPageSource()); // get the last page loaded
        
        chrome.close();
        chrome.quit();
    }
}
