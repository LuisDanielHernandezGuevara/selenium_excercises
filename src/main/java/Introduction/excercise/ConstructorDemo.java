package Introduction.excercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConstructorDemo {
	String test1 = "Test";
	String a ="Letter a";
	static int number ;
	static String city;
	
	public static WebDriver driver = new ChromeDriver();
	
	static {
		city="MX";
		number=44;
	}

	public ConstructorDemo() {
		int a =16;
		final String Test = "Test String"; // Final is used to declares constants
		System.out.println("Constructor");
		System.out.println(this.a);//Scope is global returns Letter a
		System.out.println(a); // scope is function returns 16
		
	}
	
	public ConstructorDemo(int param1 , int param2) {
		System.out.println("Param constuctor");
		int c= param1 + param2;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CONSTRUCTOR WHEN IS DECLARED RETURNS THE VALUE DECLARED WITHOUT CALL A METHOD 
		//WE CAN HAVE MORE THAN ONE CONSTRUCTOR
		//A CONSTRUCTOR CAN HAVE OR NOT PARAMS
		try {
			
			ConstructorDemo cD = new ConstructorDemo();
			ConstructorDemo cDP = new ConstructorDemo(2,3);
			
			ConstructorChild cC = new ConstructorChild();
			cC.getData();
			
			ArrayList<String> a = new ArrayList<String>();
			a.add(0,"Value1");
			a.add("value 2");
			a.remove("Value2");
			System.out.println(a);
			
			ArrayList<String> arra = new ArrayList<String>();
			arra.add("111213");
			
			List<WebElement> items = driver.findElements(By.id(""));
			
			HashMap<Integer, String> mapped = new HashMap<Integer , String>();
			mapped.put(1, "Value");
			
		}catch(Exception e) {
			System.out.println("Got the exception");
		}finally {
			System.out.println("Deleted cookies");
		}
		

	}
	
}
