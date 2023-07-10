package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions
(		tags="@Dashboard",
		features= "./Features/orangeHRM.feature",
		glue="stepDefinition",
		dryRun=false,
		monochrome=true ,//removes unnecessary characters from console
		plugin= {"pretty","html:test-output"}
		)
public class testRun {

}
