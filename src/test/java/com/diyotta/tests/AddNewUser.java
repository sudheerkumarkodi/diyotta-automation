package com.diyotta.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.diyotta.pages.AddNewProject;
import com.diyotta.pages.MainMenuPage;
import com.diyotta.pages.UserPage;

public class AddNewUser {
	MainMenuPage mainMenu = new MainMenuPage();
	LoginDiyotta loginDiyotta = new LoginDiyotta();
	CommonTestMethods commonTestMethods = new CommonTestMethods();
	UserPage userPage = new UserPage();

	@BeforeTest
	public void login() {

		loginDiyotta.openBrowser();
		loginDiyotta.login();

	}

	@Test
	public void addNewUserMethod() {
		commonTestMethods.getDriver().findElement(userPage.clickUsers).click();
		commonTestMethods.getDriver().findElement(userPage.newUser).click();
		commonTestMethods.getDriver().findElement(userPage.uid).sendKeys("test");
		commonTestMethods.getDriver().findElement(userPage.uname).sendKeys("test");
		commonTestMethods.getDriver().findElement(userPage.passwd).sendKeys("Test@143");
		commonTestMethods.getDriver().findElement(userPage.email).sendKeys("test@gmail.com");
		commonTestMethods.getDriver().findElement(userPage.phoneNo).sendKeys("8566902137");
		commonTestMethods.getDriver().findElement(userPage.privileges).click();
		commonTestMethods.getDriver().findElement(userPage.grantadmin).click();
		commonTestMethods.getDriver().findElement(userPage.saveUser).click();
		//userPage.addUser();
		//userPage.deleteUser();
	}

	@AfterTest
	public void logOut() {
		loginDiyotta.quit();
	}
}
