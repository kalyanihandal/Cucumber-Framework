package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\USER\\workspace1\\CucumberFramework\\src\\main\\java\\features\\login.feature"
				,glue={"stepDefinitions"},
		        monochrome=true
		        )
//strict=true
//dryRun=true
//format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
public class TestRunner {
	
}

