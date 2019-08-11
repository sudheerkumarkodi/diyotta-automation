package com.diyotta.steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features/", 
		glue = "com/diyotta/steps", 
		monochrome = true, 
		dryRun = false, 
		strict = false, 
		plugin = {
		"pretty", "html:target/cucumber-reports/htmlReports/",
		"json:target/cucumber-reports/jsonReports/executionReport.json" },
		tags = "@Login"
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
