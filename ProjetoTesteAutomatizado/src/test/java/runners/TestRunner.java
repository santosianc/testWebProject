package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:Features"
		,glue= {"stepdefinitions"}
		,tags = {"@End2End"} //o @End2End vai executar as duas features
		,plugin = {"pretty", "html:target/cucumber-reports"}
		,monochrome = true
		)

public class TestRunner {

}
