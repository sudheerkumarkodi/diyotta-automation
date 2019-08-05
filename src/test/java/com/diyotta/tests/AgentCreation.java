package com.diyotta.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.diyotta.pages.LoginPage;
import com.diyotta.drivers.DriverCreation;

public class AgentCreation extends DriverCreation{
	LoginDiyotta loginDiyotta = new LoginDiyotta();
	LoginPage loginPage=new LoginPage();
	CommonTestMethods commonTestMethods=new CommonTestMethods();
	
	@Test
	public void loginToDiyotta()
	{
		loginDiyotta.openBrowser();
		loginDiyotta.login();
	}

	@Test(priority = 1)
	public void openAdmin()
	{
		System.out.println("Admin page opening");
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		commonTestMethods.Module("ADMIN");
	    System.out.println("Admin page opened successfully");
	}
}
