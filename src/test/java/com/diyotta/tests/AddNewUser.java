package com.diyotta.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.diyotta.pages.AddNewProject;
import com.diyotta.pages.MainMenuPage;
import com.diyotta.pages.UserPage;


public class AddNewUser {
	MainMenuPage mainMenu= new MainMenuPage();
	LoginDiyotta loginDiyotta = new LoginDiyotta();
	CommonTestMethods commonTestMethods = new CommonTestMethods();
	UserPage userPage= new UserPage();
	
	
	@BeforeTest
	public void login(){
		loginDiyotta.openBrowser();
		loginDiyotta.login();
	}
	
	@Test
	public void addNewUserMethod() {
		userPage.addUser();
		userPage.deleteUser();
	}
	@AfterTest
	public void logOut() {
		loginDiyotta.quit();
	}
}
