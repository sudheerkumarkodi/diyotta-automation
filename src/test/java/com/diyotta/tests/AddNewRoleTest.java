package com.diyotta.tests;

import org.testng.annotations.Test;

import com.diyotta.constants.TestConstants;
import com.diyotta.pages.DiyottaAddRolePage;

public class AddNewRoleTest extends LoginDiyotta {

	CommonTestMethods commontestmethods = new CommonTestMethods();
	DiyottaAddRolePage addrole = new DiyottaAddRolePage();

	// Method for Add New Role
	@Test
	public void addNewRole() {
		
		commontestmethods.login(TestConstants.DI_USERNAME, TestConstants.DI_PASSWORD);	
		
		/*
		 * commontestmethods.getDriver().manage().timeouts().implicitlyWait(10,
		 * TimeUnit.SECONDS);
		 * commontestmethods.getDriver().findElement(addrole.RoleIcon).click();
		 * commontestmethods.getDriver().findElement(addrole.NewRoleIcon).click();
		 * commontestmethods.getDriver().findElement(addrole.RoleName).sendKeys("test");
		 * commontestmethods.getDriver().findElement(addrole.RoleSave).click();
		 */
	}
}
