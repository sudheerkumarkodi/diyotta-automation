package com.diyotta.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.diyotta.constants.TestConstants;

public class LoginDiyotta {
	CommonTestMethods commonTestMethods = new CommonTestMethods();

	@BeforeClass
	public void openBrowser() {
		commonTestMethods.launchDiyottaAppURL();
		if (commonTestMethods.getPageTitle().contains("Diyotta"))
			System.out.println(
					"Successfully Connect to Diyotta " + TestConstants.TEST_BROWSER.toUpperCase() + " Browser.");
		else
			System.out.println("Unable to connect Diyotta");

	}

	@Test(priority = 0)
	public void login() {
		commonTestMethods.login(TestConstants.DI_USERNAME, TestConstants.DI_PASSWORD);
		if (commonTestMethods.getPageTitle().contains("Studio"))
			System.out.println("Successfully Login With " + TestConstants.DI_USERNAME + " user.");
		else
			System.out.println("Unable to Login to Diyotta.");

	}

	@Test(priority = 1, enabled = false)
	public void admin() {
		commonTestMethods.shiftModule("ADMIN");
		System.out.println("Successfully open Admin.");
	}

	@Test
	public void quit() {
		commonTestMethods.logout();
		System.out.println("Successfully Logout.");
		commonTestMethods.closeBrowser();
		System.out.println("Browser Closed.");
	}

}
