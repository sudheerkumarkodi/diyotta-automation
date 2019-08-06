package com.diyotta.pages;

import org.openqa.selenium.By;

import com.diyotta.drivers.DriverCreation;

public class DiyottaAddRolePage extends DriverCreation {
	public  By RoleIcon   = By.xpath("//a[@title='Roles']");
	public  By NewRoleIcon = By.xpath("//div[@title='New']");
	public  By RoleName    = By.id("inputControl_1");
	public By  RoleSave=By.xpath("//button[@title='Save']");
	  
	  
	  
	  

}
