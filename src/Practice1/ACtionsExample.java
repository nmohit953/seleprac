package Practice1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ACtionsExample {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		ChromeDriver driver= new ChromeDriver(ops) ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ixigo.com/search/result/flight?from=DEL&to=BOM&date=08022024&returnDate=&adults=1&children=0&infants=0&class=e&source=Search%20Form");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.xpath("//span[text()='4644']/parent::div/parent::div/parent::a/div[@class='otlk-date']"));
		System.out.println(e.getText());
		
	
	
	}

}
