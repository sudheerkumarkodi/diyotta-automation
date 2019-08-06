package com.diyotta.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.diyotta.constants.TestConstants;
import com.diyotta.pages.DiyottaAddRolePage;

public class TestRunner {
	CommonTestMethods commonTestMethods = new CommonTestMethods();
	DiyottaAddRolePage diyottaAddRolePage = new DiyottaAddRolePage();

	@BeforeTest
	public void beforeTest() {
		commonTestMethods.launchDiyottaAppURL();
		commonTestMethods.login(TestConstants.DI_USERNAME, TestConstants.DI_PASSWORD);
	}

	@Test(priority = 0, groups = { "AddUserRole" })
	public void addUserRole() {
		diyottaAddRolePage.addNewRole();
	}

	@Test(priority = 0, groups = { "AddAgent" })
	public void addAgentRole() {
		diyottaAddRolePage.addNewRole();
	}

	@AfterTest
	public void afterTest() {
		commonTestMethods.logout();
		commonTestMethods.closeBrowser();
	}

}
