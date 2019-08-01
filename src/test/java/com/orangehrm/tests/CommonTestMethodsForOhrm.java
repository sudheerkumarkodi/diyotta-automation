package com.orangehrm.tests;

import java.util.concurrent.TimeUnit;

import com.diyotta.constants.TestConstants;
import com.diyotta.drivers.DriverCreation;
import com.orangehrm.pages.EmployeeInformationSearch;

public class CommonTestMethodsForOhrm extends DriverCreation {

	EmployeeInformationSearch loginPage = new EmployeeInformationSearch();

	public void launchOhrmAppURL() {
		createDriver();
		driver.get(TestConstants.OHRM_APP_URL);
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
