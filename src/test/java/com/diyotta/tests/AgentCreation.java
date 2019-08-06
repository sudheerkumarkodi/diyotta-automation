package com.diyotta.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.diyotta.constants.TestConstants;
import com.diyotta.drivers.DriverCreation;
import com.diyotta.pages.AgentCreationPage;
import com.diyotta.pages.CommonItems;

public class AgentCreation {
	LoginDiyotta loginDiyotta=new LoginDiyotta();
	CommonTestMethods commonTestMethods =new CommonTestMethods();
	AgentCreationPage agentCreationPage =new AgentCreationPage();
	CommonItems commonItems = new CommonItems();

	@BeforeClass
	public void loginToDiyotta()
	{
		commonTestMethods.launchDiyottaAppURL();
		commonTestMethods.login(TestConstants.DI_USERNAME,TestConstants.DI_PASSWORD);
		
//		loginDiyotta.openBrowser();
//		loginDiyotta.login();
		
//		if(getDriver().findElement(By.xpath("//div[@id='loginForciblePopupId']/div/div[3]/div/button[2]")).isDisplayed())
//			  {
//				  System.out.println("If enter");
//				  Thread.sleep(3000);
//				  getDriver().findElement(By.xpath("//div[@id='loginForciblePopupId']/div/div[3]/div/button[2]")).click();
//			  }
//			  {
//				  System.out.println("Say Enter");
//			  }
		
		
	}
	@Test(priority = 0)
	public void openAdmin()
	{
		commonTestMethods.getDriver().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println("Admin page");
//		commonTestMethods.shiftModule("ADMIN");
		commonTestMethods.getDriver().findElement(commonItems.moduleMenu).click();
		commonTestMethods.getDriver().findElement(commonItems.moduleAdmin).click();
		System.out.println("Admin page opened");
	}
	
	@Test(priority = 1,enabled = true)
	public void agentCreationPage()
	{
		System.out.println("Click on expand");
		commonTestMethods.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		commonTestMethods.getDriver().findElement(agentCreationPage.expand).click();
		
		System.out.println("Click on agents");
		commonTestMethods.getDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println(commonTestMethods.getDriver().findElement(agentCreationPage.agents).isEnabled());
		commonTestMethods.getDriver().findElement(agentCreationPage.agents).click();
		System.out.println("Click on New button");
		commonTestMethods.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		commonTestMethods.getDriver().findElement(agentCreationPage.newAgent).click();
	}
}
