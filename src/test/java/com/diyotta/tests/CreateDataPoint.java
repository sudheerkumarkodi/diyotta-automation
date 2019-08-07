package com.diyotta.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.diyotta.constants.TestConstants;

public class CreateDataPoint {
	
	CommonTestMethods commonTestMethods = new CommonTestMethods();
	StudioMenus studioMenus = new StudioMenus();

	@BeforeTest
	public void openBrowserAndLogin() {
		commonTestMethods.launchDiyottaAppURL();
		commonTestMethods.login(TestConstants.DI_USERNAME, TestConstants.DI_PASSWORD);
	}

	@Test
	public void openDataObject() {
		studioMenus.shiftMenu("data object");
		System.out.println("Successfully open data object.");
	}

	@AfterTest
	public void logoutAndCloseBrowser() {
		commonTestMethods.logout();
		System.out.println("Successfully Logout.");
		commonTestMethods.closeBrowser();
	}
}
