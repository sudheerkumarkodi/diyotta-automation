package com.diyotta.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {

	CommonTestMethods commonTestMethods = new CommonTestMethods();

	@Test
	@Parameters({ "browserName", "userName", "password" })
	public void login_to_app(String browserName, String uName, String password) {
		commonTestMethods.launchDiyottaAppURLNew(browserName);
		commonTestMethods.login(uName, password);
	}

}
