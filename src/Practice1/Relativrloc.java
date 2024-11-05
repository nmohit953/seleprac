package Practice1;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Relativrloc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Grid\\edgedriver_win64\\edgedriver_win64\\msedgedriver.exe");
	
	EdgeOptions ops = new EdgeOptions();
	ops.addArguments("--remote-allow-origins=*");
	EdgeDriver driver= new EdgeDriver(ops) ;
	driver.manage().window().maximize();
	driver.get("https://www.airvistara.com/in/en/flight-booking?gclid=Cj0KCQjwt_qgBhDFARIsABcDjOcuoR4ZiqbliUw6Bw61GpFLQiirSKItLaT-jt3tDer_w92PywuEo4IaAuUeEALw_wcB&utm_source=Google&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=Cj0KCQjwt_qgBhDFARIsABcDjOcuoR4ZiqbliUw6Bw61GpFLQiirSKItLaT-jt3tDer_w92PywuEo4IaAuUeEALw_wcB:G:s&s_kwcid=AL!596!3!636601358040!p!!g!!vistara&s_kwcid=AL!596!3!636601358040!p!!g!!vistara");
		
	}

}
