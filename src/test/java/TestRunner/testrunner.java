package TestRunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/feature"
	,glue= {"Stepdefination","configure"},
		
		
		//dryRun=true,
		//monochrome=true,
		plugin= {"pretty","html:target/cucumber-reports"}
	)
public class testrunner {

}
