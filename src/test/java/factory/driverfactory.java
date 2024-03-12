package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverfactory {
	static WebDriver driver = null;
	public static WebDriver browsername(String browsername) {
		if(browsername.equalsIgnoreCase("Chrome")) {
			 driver = new ChromeDriver();	
		}
		else if (browsername.equals("firefox")) {
		driver = new FirefoxDriver();
		}
	else if(browsername.equals("edge")) {
		driver= new EdgeDriver();
	}	
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	
	public static  WebDriver getDriver() {
		return driver;
	}
}
