package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features= {"asebe.feature"},
	
	glue= {"asebe.java"},
	
	dryRun= true,
	monochrome=false
		
		)
public class TestRunner1 {

}
