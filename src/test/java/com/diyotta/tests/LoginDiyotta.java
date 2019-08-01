package com.diyotta.tests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.diyotta.constants.*;

public class LoginDiyotta {
	CommonTestMethods commonTestMethods = new CommonTestMethods();

	@BeforeSuite
	public void openBrowser() {
		commonTestMethods.launchDiyottaAppURL();
		System.out.println("Successfully Connect to Diyotta " + TestConstants.TEST_BROWSER.toUpperCase() + " Browser.");
	}

	@Test
	public void login() {
		commonTestMethods.login(TestConstants.DI_USERNAME, TestConstants.DI_PASSWORD);
	}

}
