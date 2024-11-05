package Practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;





public class testingparctise {
	
	public static void main(String[] args) throws IOException  {
		
		
		 Properties prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
					+ "//src//proper//GlobalData.properties");
			prop.load(fis);
			String browserName = System.getProperty("browser")!=null ? System.getProperty("browser") :prop.getProperty("browser");
			if (browserName.contains("chrome")) {
				String url= prop.getProperty("url");
				String wait =prop.getProperty("wait");
				int wait1=Integer.parseInt(wait); 
				ChromeOptions op =new ChromeOptions();
				op.setAcceptInsecureCerts(true);
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Grid\\chromedriver_win32 (4)\\chromedriver.exe");
				WebDriver driver=new ChromeDriver(op);
				driver.get(url);
				System.out.println(driver.getTitle());
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait1));
			
			
			}
	
	
		
		

		
		//softAssert ass=new SoftAssert();
		

		
		

			
		
		
	}

}
