package com.diyotta.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import com.diyotta.constants.TestConstants;
import com.diyotta.drivers.DriverCreation;
import com.diyotta.pages.CommonItems;
import com.diyotta.pages.LoginPage;

public class CommonTestMethods extends DriverCreation {

	LoginPage loginPage = new LoginPage();
	CommonItems commonItems = new CommonItems();

	public void launchDiyottaAppURL() {
		createDriver();
		driver.manage().window().maximize();
		driver.get(TestConstants.APP_URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void login(String userName, String password) {
		driver.findElement(loginPage.txtUserName).sendKeys(userName);
		driver.findElement(loginPage.txtPassword).sendKeys(password);
		driver.findElement(loginPage.loginButton).click();
		if (driver.findElement(loginPage.warningPopup).isDisplayed()) {
			System.out.println("Warning pop up Displayed");
			// WebElement element = driver.findElement(loginPage.warningContain);
			// System.out.println(element.getText());
			// driver.findElement(loginPage.forceLogin).click();
		} else
			System.out.println("Warning pop up not present");
	}

	public String getPageTitle() {
		String browserTitle = driver.getTitle();
		return browserTitle;
	}
	
	public void AdminModule(String module) {		
		switch (module.toUpperCase()) {
		case "STUDIO":
			driver.findElement(commonItems.moduleMenu).click();
			driver.findElement(commonItems.moduleAdmin).click();
			break;
		case "MONITOR":
			driver.findElement(commonItems.moduleMenu).click();
			driver.findElement(commonItems.moduleAdmin).click();
			break;
		case "ADMIN":
			driver.findElement(commonItems.moduleMenu).click();
			driver.findElement(commonItems.moduleAdmin).click();		
			break;
		case "SCHEDULER":
			driver.findElement(commonItems.moduleMenu).click();
			driver.findElement(commonItems.moduleAdmin).click();		
			break;
		default:
			System.out.println("Please provide valid module name.");
			break;
		}
		
	}

	public void logout() {
		driver.findElement(commonItems.user).click();
		driver.findElement(commonItems.logout).click();

	}

	public void closeBrowser() {
		destroyDriver();
	}

}
