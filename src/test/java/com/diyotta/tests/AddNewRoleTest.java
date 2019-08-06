package com.diyotta.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.diyotta.constants.TestConstants;
import com.diyotta.pages.DiyottaAddRolePage;

public class AddNewRoleTest {

	CommonTestMethods commonTestMethods = new CommonTestMethods();
	DiyottaAddRolePage addrole = new DiyottaAddRolePage();

	@BeforeTest
	public void beforeTest() {
		commonTestMethods.launchDiyottaAppURL();
		commonTestMethods.login(TestConstants.DI_USERNAME, TestConstants.DI_PASSWORD);
	}

	@Test(priority = 0, groups = { "AddUserRole" })
	public void addUserRole() {
		addrole.addNewRole();
		addrole.deleteUserRole();
	}

	@AfterTest
	public void afterTest() {
		commonTestMethods.logout();
		commonTestMethods.closeBrowser();
	}

}
