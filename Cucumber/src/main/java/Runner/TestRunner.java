  
package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "E:\\sachinLearnings\\CucumberWorkspace\\Cucumber\\src\\main\\java\\Features\\Login.feature", //the path of the feature files
			glue={"stepDefinations"}, //the path of the step definition files
			format= {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},   // to generate output in pretty format or to generate different types of reporting
			monochrome = true,        // display the console output in proper readable format.
			strict = true,            // It will check if any step is not defined or pending in step defination file.
			dryRun=false              //  to check the mapping is proper between feature file and step defination file.
						
			)
	 
	public class TestRunner {
	 
	}
	