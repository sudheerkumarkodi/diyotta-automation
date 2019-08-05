package com.diyotta.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.diyotta.constants.TestConstants;

public class OpenDiyottaAndExit {
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

	@AfterClass
	public void quit() {
		commonTestMethods.logout();
		System.out.println("Successfully Logout.");
		commonTestMethods.closeBrowser();
		System.out.println("Browser Closed.");
	}

}
