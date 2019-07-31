package com.diyotta.tests;

import java.util.concurrent.TimeUnit;

import com.diyotta.constants.TestConstants;
import com.diyotta.drivers.DriverCreation;
import com.diyotta.pages.LoginPage;

public class CommonTestMethods extends DriverCreation {

	LoginPage loginPage = new LoginPage();

	public void launchDiyottaAppURL() {
		createDriver();
		driver.get(TestConstants.APP_URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void login(String userName, String password) {
		driver.findElement(loginPage.txtUserName).sendKeys(userName);
		driver.findElement(loginPage.txtPassword).sendKeys(password);
		driver.findElement(loginPage.loginButton).click();
	}

	public void closeBrowser() {
		destroyDriver();
	}

}
