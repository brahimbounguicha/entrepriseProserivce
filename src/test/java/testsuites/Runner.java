package testsuites;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features ="src/test/resources/HomePageHRM.feature",
		glue ="testsuites",
		plugin = {"pretty","html:target/cucmber-report.html"}
		
		)



public class Runner {
	


}
