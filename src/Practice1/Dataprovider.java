package Practice1;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Dataprovider {
	
	WebDriver driver;
	

	@Test(dataProvider="testdata")
	public void datapro(HashMap<String ,String> h1) throws Exception{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Grid\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(h1.get("name"));
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(h1.get("pass"));
		
		
	}
	
	@DataProvider(name="testdata")
	public  Object[][] credential() {
		
//		Object[][] ob= new Object[2][2];
//		ob[0][0]="mohit1";
//		ob[0][1]="pass1";
//		ob[1][0]="mohit2";
//		ob[1][1]="mohit2";
		
		HashMap<String ,String > m1=new HashMap<String ,String >();
		m1.put("name", "mohit1");
		m1.put("pass", "pass1");
		HashMap<String ,String > m2=new HashMap<String ,String >();
		m2.put("name", "mohit2");
		m2.put("pass", "pass2");
		return new Object[][] {{m1},{m2}};
	
	

		
	}
	

}
