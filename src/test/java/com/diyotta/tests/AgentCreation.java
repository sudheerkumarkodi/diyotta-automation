package com.diyotta.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.diyotta.drivers.DriverCreation;
import com.diyotta.pages.AgentCreationPage;

public class AgentCreation extends DriverCreation{
	LoginDiyotta loginDiyotta=new LoginDiyotta();
	CommonTestMethods commonTestMethods =new CommonTestMethods();
	AgentCreationPage agentCreationPage =new AgentCreationPage();

	@BeforeClass
	public void loginToDiyotta()
	{
		loginDiyotta.openBrowser();
		loginDiyotta.login();
		
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
		getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		commonTestMethods.shiftModule("ADMIN");
		loginDiyotta.admin();
		System.out.println("Admin page opened");
	}
	
	@Test(priority = 1,enabled = true)
	public void agentCreationPage()
	{
		System.out.println("Click on expand");
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		getDriver().findElement(agentCreationPage.expand).click();
		System.out.println("Click on agents");
		getDriver().findElement(agentCreationPage.agents).click();
		getDriver().findElement(agentCreationPage.newAgent).click();
	}
}
