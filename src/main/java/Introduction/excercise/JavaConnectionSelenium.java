package Introduction.excercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaConnectionSelenium {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_75412", "student", "@Password123");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from credentials where scenario = ");
	
		while(rs.next()){
		driver.findElement(By.xpath("/*[@id='username']")).sendKeys(rs.getString("username"));
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(rs.getString("password"));
		
		}
	}

}
