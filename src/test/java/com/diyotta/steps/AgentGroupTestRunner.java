package com.diyotta.steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = "/diyotta-automation/src/test/resources/features/AgentGroup.feature",
				glue = "/diyotta-automation/src/test/java/com/diyotta/tests/AgentGroup_StepDefinition.java",
				monochrome = true,
				strict = true,
				plugin = {"pretty", "html:target/htmlreport/executionReport.html", "json:target/jsonreport/executionReport.json"})
public class AgentGroupTestRunner extends AbstractTestNGCucumberTests{

}
