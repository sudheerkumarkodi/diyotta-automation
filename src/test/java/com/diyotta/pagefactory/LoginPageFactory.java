package com.diyotta.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.diyotta.drivers.DriverCreation;

public class LoginPageFactory {

	DriverCreation driverCreation = new DriverCreation();

	public LoginPageFactory() {
		PageFactory.initElements(driverCreation.getDriver(), this);
	}

	@FindBy(id = "inputControl_1")
	@CacheLookup
	public WebElement txtUserName;

	@FindBy(id = "inputControl_2")
	public WebElement txtPassword;

	@FindBy(id = "inputControl_5")
	public WebElement btnLogin;

	@FindBy(xpath = "//button[contains(@ng-click,'forciableLogin()')]")
	public WebElement btnForceLogin;

	public void enterUserName(String userName) {
		driverCreation.getWebActions().setValue(txtUserName, userName);
	}

	public void enterUserPassword(String password) {
		driverCreation.getWebActions().setValue(txtPassword, password);
	}

	public void clickOnLoginButton() {
		driverCreation.getWebActions().click(btnLogin);
	}

	// public By txtUserName = By.id("inputControl_1");
	// public By txtPassword = By.id("inputControl_2");
	// public By loginButton = By.id("inputControl_5");
	public By warningPopup = By.id("loginForciblePopupId");
	public By warningContain = By.xpath("//p[@class='alert-msg padding-bottom-20 ng-binding']");
	public By forceLogin = By.xpath("//button[contains(@ng-click,'forciableLogin()')]");
	public By warningCancel = By.xpath("//button[contains(@ng-click,'loginForciblePopup.close()')]");

}
