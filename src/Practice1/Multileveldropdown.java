package Practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multileveldropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.ixigo.com/search/result/flight?from=DEL&to=BOM&date=29012024&returnDate=&adults=1&children=0&infants=0&class=e&source=Search%20Form");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//button[normalize-space()='Accounts & Deposits']")).click();
//
//		driver.findElement(By.id("sm-1676864724497818-14")).click();
		
		Actions action= new Actions(driver);
		
		//action.moveToElement(driver.findElement(By.xpath("//button[normalize-space()='Accounts & Deposits']"))).build().perform();
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[4]/div[1]/div[1]/div[3]/div/div/div[1]/a[3]/div[2]/div/span[2]"))

	}

}
