package com.diyotta.pages;

import org.openqa.selenium.By;

public class LoginPage {
	public By txtUserName = By.id("inputControl_1");
	public By txtPassword = By.id("inputControl_2");
	public By loginButton = By.id("inputControl_5");
	public By warningPopup = By.id("loginForciblePopupId");
	public By warningContain = By.xpath("//p[@class='alert-msg padding-bottom-20 ng-binding']");
	public By forceLogin = By.xpath("//button[contains(@ng-click,'forciableLogin()')]");
	public By warningCancel = By.xpath("//button[contains(@ng-click,'loginForciblePopup.close()')]");

}
