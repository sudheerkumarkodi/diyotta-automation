package com.diyotta.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.diyotta.constants.TestConstants;
import com.diyotta.pages.AddNewProject;

public class AddNewProjectTest {

	AddNewProject addNewProject = new AddNewProject();
	LoginDiyotta loginDiyotta = new LoginDiyotta();
	CommonTestMethods commonTestMethods = new CommonTestMethods();
	
	@BeforeClass
	public void openBrowser() {
		commonTestMethods.launchDiyottaAppURL();
		System.out.println("We are in @BeforeClass method");
	}

	@Test(priority = 0)
	public void addNewProjectMethod() throws InterruptedException {

		System.out.println("We are in @Test method");
		commonTestMethods.login(TestConstants.DI_USERNAME, TestConstants.DI_PASSWORD);
		commonTestMethods.getDriver().findElement(addNewProject.diyottaMenus).click();
		commonTestMethods.getDriver().findElement(addNewProject.adminMenu).click();
		Thread.sleep(10000);
		commonTestMethods.getDriver().findElement(addNewProject.projectMenu).click();
		commonTestMethods.getDriver().findElement(addNewProject.newProjectButton).click();
		WebElement webElement = commonTestMethods.getDriver().findElement(addNewProject.normalProjectBtn);
		Actions act = new Actions(commonTestMethods.getDriver());
		act.moveToElement(webElement).perform();
		webElement.click();
		commonTestMethods.getDriver().findElement(addNewProject.newProjectName).sendKeys(TestConstants.AD_PROJECT_NAME);
		commonTestMethods.getDriver().findElement(addNewProject.newProjectCode).sendKeys(TestConstants.AD_PROJECT_CODE);
		commonTestMethods.getDriver().findElement(addNewProject.newProjectDescription).sendKeys(TestConstants.AD_PROJECT_DESC);
		commonTestMethods.getDriver().findElement(addNewProject.addLayers).click();
		commonTestMethods.getDriver().findElement(addNewProject.addLayers).click();
		commonTestMethods.getDriver().findElement(addNewProject.layer).click();
		commonTestMethods.getDriver().findElement(addNewProject.newProjectSaveBtn).click();
		
	}

	@AfterClass
	public void logout() throws InterruptedException {
		System.out.println("We are in @AfterClass method");
		Thread.sleep(5000);
		commonTestMethods.logout();
		commonTestMethods.closeBrowser();
	}

}
