package com.diyotta.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.diyotta.constants.TestConstants;
import com.diyotta.drivers.DriverCreation;
import com.diyotta.pages.CommonItems;
import com.diyotta.pages.LoginPage;

public class CommonTestMethods extends DriverCreation {

	LoginPage loginPage = new LoginPage();
	CommonItems commonItems = new CommonItems();

	public void launchDiyottaAppURL() {
		createDriver();
		getDriver().manage().window().maximize();
		getDriver().get(TestConstants.APP_URL);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void launchDiyottaAppURLNew(String browser) {
		createDriverNew(browser);
		getDriver().manage().window().maximize();
		System.out.println(TestConstants.APP_URL);
		getDriver().get(TestConstants.APP_URL);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/**
	 * @author sysadmin This method is used for login to diyotta appication
	 * @param userName
	 * @param password
	 */
	public void login(String userName, String password) {
		getDriver().findElement(loginPage.txtUserName).sendKeys(userName);
		getDriver().findElement(loginPage.txtPassword).sendKeys(password);
		getDriver().findElement(loginPage.loginButton).click();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (getDriver().findElement(loginPage.warningPopup).isDisplayed()) {
			System.out.println("Warning pop up Displayed");
			// WebElement element =
			// getDriver().findElement(loginPage.warningContain);
			// System.out.println(element.getText());
			// getDriver().findElement(loginPage.forceLogin).click();
		} else
			System.out.println("Warning pop up not present");
	}

	public String getPageTitle() {
		String browserTitle = getDriver().getTitle();
		return browserTitle;
	}

	public void shiftModule(String moduleName) {
		switch (moduleName.toUpperCase()) {
		case "STUDIO":
			getDriver().findElement(commonItems.moduleMenu).click();
			getDriver().findElement(commonItems.moduleAdmin).click();
			break;
		case "MONITOR":
			getDriver().findElement(commonItems.moduleMenu).click();
			getDriver().findElement(commonItems.moduleAdmin).click();
			break;
		case "ADMIN":
			getDriver().findElement(commonItems.moduleMenu).click();
			getDriver().findElement(commonItems.moduleAdmin).click();
			break;
		case "SCHEDULER":
			getDriver().findElement(commonItems.moduleMenu).click();
			getDriver().findElement(commonItems.moduleAdmin).click();
			break;
		default:
			System.out.println("Please provide valid module name.");
			break;
		}

	}

	public void logout() {
		getDriver().findElement(commonItems.user).click();
		getDriver().findElement(commonItems.logout).click();

	}

	public void closeBrowser() {
		destroyDriver();
	}

}
