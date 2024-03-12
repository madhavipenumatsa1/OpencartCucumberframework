import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resource/features",
		glue = {"stepdefinitions","hookes"},
		publish = true,
		plugin = {"pretty","html:target/CucumberReporter/CucumberReporter.html"}
		)

public class TestMyRunner {

}
