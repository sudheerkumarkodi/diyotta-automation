package com.diyotta.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.diyotta.drivers.DriverCreation;
import com.diyotta.tests.CommonTestMethods;

public class DiyottaAddRolePage extends DriverCreation {

	CommonTestMethods commonTestMethods = new CommonTestMethods();

	public By RoleIcon = By.xpath("//a[@title='Roles']");
	public By NewRoleIcon = By.xpath("//div[@title='New']");
	public By RoleName = By.id("inputControl_1");
	public By RoleSave = By.xpath("//button[@title='Save']");

	public void addNewRole() {
		commonTestMethods.shiftModule("admin");
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getDriver().findElement(RoleIcon).click();
		getDriver().findElement(NewRoleIcon).click();
		getDriver().findElement(RoleName).sendKeys("test");
		getDriver().findElement(RoleSave).click();
	}

	public void deleteUserRole() {

	}

}
