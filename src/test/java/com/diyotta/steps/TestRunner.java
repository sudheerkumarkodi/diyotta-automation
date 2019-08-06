package com.diyotta.steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/", 
				glue = "src/test/java/com/diyotta/steps/", 
				monochrome = true,
				dryRun = false,
				strict = true,
				plugin = {},
				tags = "@Smoke"
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
