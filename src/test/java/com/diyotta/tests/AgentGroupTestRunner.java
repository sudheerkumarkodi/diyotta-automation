package com.diyotta.tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", 
				glue = "src/test/java/com/diyotta/tests/", 
				monochrome = true, 
				dryRun = false,
				strict = true, 
				plugin = {"pretty", "html:target/htmlreport/executionReport.html", "json:target/jsonreport/executionReport.json" })

public class AgentGroupTestRunner extends AbstractTestNGCucumberTests {

}
