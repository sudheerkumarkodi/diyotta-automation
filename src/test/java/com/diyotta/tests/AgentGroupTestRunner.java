package com.diyotta.tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/AgentGroup.feature", glue = "src/test/java/com/diyotta/tests/", monochrome = true, strict = true, plugin = {
		"pretty", "html:target/htmlreport/executionReport.html", "json:target/jsonreport/executionReport.json" })
public class AgentGroupTestRunner extends AbstractTestNGCucumberTests {

}
