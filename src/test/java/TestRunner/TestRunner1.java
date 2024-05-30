package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features= {"G99Login.feature"},
	
	glue= {"G99Login.java"},
	
	dryRun= true,
	monochrome=false
		
		)
public class TestRunner1 {

}
