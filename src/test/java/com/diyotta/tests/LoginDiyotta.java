package com.diyotta.tests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.diyotta.constants.*;

public class LoginDiyotta {
	CommonTestMethods commonTestMethods = new CommonTestMethods();

	@BeforeSuite
	public void openBrowser() {
		commonTestMethods.launchDiyottaAppURL();
		if (commonTestMethods.getPageTitle() == "Diyotta ")
			System.out.println(
					"Successfully Connect to Diyotta " + TestConstants.TEST_BROWSER.toUpperCase() + " Browser.");
		else
			System.out.println("Unable to connect Diyotta");

	}

	@Test
	public void login() {
		commonTestMethods.login(TestConstants.DI_USERNAME, TestConstants.DI_PASSWORD);
		if (commonTestMethods.getPageTitle() == " Diyotta | Studio")
			System.out.println("Successfully Login With "+TestConstants.DI_USERNAME+" user.");
		else
			System.out.println("Unable to Login to Diyotta");
	}

}
