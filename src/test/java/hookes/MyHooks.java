package hookes;



import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;


public class MyHooks {
	WebDriver driver;
	@Before
	public void setup() {
 Properties prop= ConfigReader.intilizeproperties();
	driver =	driverfactory.browsername(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		
		
	}
	@After
	public void teardown(Scenario scenario) {
	String scenarioname	= scenario.getName().replace(" ", "_");
	if(scenario.isFailed()) {
		
		byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(srcScreenshot,"image/png", scenarioname);
	}
	
		driver.quit();
	}
}
