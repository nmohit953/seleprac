package Practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class testing {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		//ops.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		
		
	
		driver.navigate().to("https://www.opencart.com/");
		//driver.findElement(By.linkText("Support This Project")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
		
	}

}
