package com.diyotta.tests;

import org.testng.annotations.Test;

import com.diyotta.pages.AddNewProject;

public class AddNewProjectTest {

	AddNewProject addNewProject = new AddNewProject();
	LoginDiyotta loginDiyotta = new LoginDiyotta();
	CommonTestMethods commonTestMethods = new CommonTestMethods();

	@Test(priority = 0)
	public void addNewProjectMethod() throws InterruptedException {

		loginDiyotta.openBrowser();
		loginDiyotta.login();
		commonTestMethods.getDriver().findElement(addNewProject.diyottaMenus).click();

		loginDiyotta.quit();
		/*
		 * commonTestMethods.launchDiyottaAppURL();
		 * commonTestMethods.login("manoj", "P2wd_4321");
		 */
		/*
		 * loginDiyotta.openBrowser(); loginDiyotta.login();
		 */
		/*
		 * System.setProperty("webdriver.chrome.getDriver()",
		 * "C:\\Users\\E190402\\Desktop\\Manoj\\Selenium\\diyotta-automation-git\\diyotta-automation\\src\\test\\resources\\drivers\\chromedriver.exe"
		 * ); getDriver() = new ChromeDriver();
		 * getDriver().get("http://172.40.9.120:9000/");
		 * getDriver().manage().window().maximize();
		 * getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * getDriver().findElement(By.id("inputControl_1")).sendKeys("manoj");
		 * getDriver().findElement(By.id("inputControl_2")).sendKeys("P2wd_4321");
		 * getDriver().findElement(By.id("inputControl_5")).click();
		 * 
		 * addNewProject.setDiyottaMenus(getDriver());
		 * addNewProject.setAdminMenu(getDriver());
		 * addNewProject.setProjectMenu(getDriver());
		 * addNewProject.setNewProjectButton(getDriver());
		 * addNewProject.setNormalProjectBtn(getDriver());
		 * addNewProject.setNewProjectName(getDriver(), "Project_Selenium");
		 * addNewProject.setNewProjectCode(getDriver(), "2662");
		 * addNewProject.setNewProjectDescription(getDriver(), "Project_Selenium");
		 * addNewProject.setAddLayers(getDriver()); addNewProject.setLayer(getDriver());
		 * addNewProject.setNewProjectSaveBtn(getDriver());
		 * addNewProject.setProjectMenu(getDriver());
		 */
		
		/*
		 * loginDiyotta.openBrowser(); loginDiyotta.login();
		 * loginDiyotta.driverInstance().findElement(addNewProject.diyottaMenus).click()
		 * ; loginDiyotta.driverInstance().findElement(addNewProject.adminMenu).click();
		 * Thread.sleep(10000);
		 * loginDiyotta.driverInstance().findElement(addNewProject.projectMenu).click();
		 * loginDiyotta.driverInstance().findElement(addNewProject.newProjectButton).
		 * click(); WebElement webElement =
		 * loginDiyotta.driverInstance().findElement(addNewProject.normalProjectBtn);
		 * Actions act = new Actions(loginDiyotta.driverInstance());
		 * act.moveToElement(webElement).perform(); webElement.click();
		 * loginDiyotta.driverInstance().findElement(addNewProject.newProjectName).
		 * sendKeys("manoj751");
		 * loginDiyotta.driverInstance().findElement(addNewProject.newProjectCode).
		 * sendKeys("manoj751");
		 * loginDiyotta.driverInstance().findElement(addNewProject.newProjectDescription
		 * ).sendKeys("manoj751");
		 * loginDiyotta.driverInstance().findElement(addNewProject.addLayers).click();
		 * loginDiyotta.driverInstance().findElement(addNewProject.layer).click();
		 * loginDiyotta.driverInstance().findElement(addNewProject.newProjectSaveBtn).
		 * click(); loginDiyotta.quit();
		 * 
		 * 
		 * public WebDriver driverInstance() { return commonTestMethods.getDriver(); }
		 */
		
		
	}
}
