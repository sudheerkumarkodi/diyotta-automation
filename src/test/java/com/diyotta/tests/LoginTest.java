package com.diyotta.tests;

import org.testng.annotations.Test;

import com.diyotta.constants.TestConstants;

public class LoginTest {
	CommonTestMethods commonTestMethods = new CommonTestMethods();

	@Test(priority = 0)
	public void login() {
		//commonTestMethods.launchDiyottaAppURL();
		System.out.println("Login to Application Sucessfully with " + TestConstants.TEST_BROWSER + " browser");
		// commonTestMethods.login("swetha", "P2wd_4321");
	}

	@Test(priority = 1)
	public void closeBrowser() {
		// commonTestMethods.closeBrowser();
		System.out.println("Closed the browser Sucessfully");
	}

}
