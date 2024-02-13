package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {".//Features/Loginsteps.feature"}, glue={"StepDefinitions"},plugin= {"pretty","html:target/HtmlReports"} )
public class TestRun {

	
}
