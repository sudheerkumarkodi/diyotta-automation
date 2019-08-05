package com.diyotta.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.diyotta.pages.DiyottaAddRolePage;

public class AddNewRoleTest extends LoginDiyotta {

	CommonTestMethods commontestmethods = new CommonTestMethods();
	DiyottaAddRolePage addrole = new DiyottaAddRolePage();
	
	// Method for Add New Role
	@Test	
	public void addNewRole() {
		openBrowser();
		login();
		commontestmethods.driver.findElement(addrole.RoleIcon).click();
		commontestmethods.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		commontestmethods.driver.findElement(addrole.NewRoleIcon).click();
		commontestmethods.driver.findElement(addrole.RoleName).sendKeys("test");
		commontestmethods.driver.findElement(addrole.RoleSave).click();
	}
}
