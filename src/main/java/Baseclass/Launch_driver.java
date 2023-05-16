package Baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_driver {
	public static WebDriver chromebrowser() {
		
		WebDriverManager.chromedriver().setup();
			
			//Casting of chrome driver
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("https://jqueryui.com/datepicker/#date%E2%88%92range");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			return driver;
			
	
	
	
	}

}
