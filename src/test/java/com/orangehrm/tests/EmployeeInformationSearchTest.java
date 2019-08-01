package com.orangehrm.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.diyotta.constants.TestConstants;
import com.diyotta.drivers.DriverCreation;
import com.diyotta.tests.CommonTestMethods;

public class EmployeeInformationSearchTest {
	DriverCreation driverCreation = new DriverCreation();
	final String dir = System.getProperty("user.dir");
	//WebDriver driver;
	
	CommonTestMethodsForOhrm commonTestMethods = new CommonTestMethodsForOhrm();
	
	@Test
	public void login() {
		commonTestMethods.launchOhrmAppURL();
		commonTestMethods.login("Admin", "admin123");
	}
}
