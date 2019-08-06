package com.diyotta.tests;

import org.testng.annotations.Test;

import com.diyotta.pages.AddNewProject;
import com.diyotta.pages.MainMenu;


public class AddNewUser {
	MainMenu mainMenu= new MainMenu();
	LoginDiyotta loginDiyotta = new LoginDiyotta();
	CommonTestMethods commonTestMethods = new CommonTestMethods();
	
	@Test(priority = 0)
	public void addNewUserMethod() {
		loginDiyotta.openBrowser();
		loginDiyotta.login();
		commonTestMethods.getDriver().findElement(mainMenu.clickOnMainMenu).click();
		commonTestMethods.getDriver().findElement(mainMenu.admin).click();
		
		loginDiyotta.quit();
		
	}

}
