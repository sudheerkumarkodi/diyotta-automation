package com.diyotta.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.diyotta.drivers.DriverCreation;
import com.diyotta.pages.AddNewProject;

public class AddNewProjectTest extends DriverCreation {

	AddNewProject addNewProject = new AddNewProject();
	LoginDiyotta loginDiyotta = new LoginDiyotta();
	CommonTestMethods commonTestMethods = new CommonTestMethods();

	@Test(priority = 0)
	public void addNewProjectMethod() throws InterruptedException {
		/*
		 * commonTestMethods.launchDiyottaAppURL(); commonTestMethods.login("manoj",
		 * "P2wd_4321");
		 */
		/*
		 * loginDiyotta.openBrowser(); loginDiyotta.login();
		 */
		System.setProperty("webdriver.chrome.driver","C:\\Users\\E190402\\Desktop\\Manoj\\Selenium\\diyotta-automation-git\\diyotta-automation\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://172.40.9.120:9000/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("inputControl_1")).sendKeys("manoj");
		driver.findElement(By.id("inputControl_2")).sendKeys("P2wd_4321");
		driver.findElement(By.id("inputControl_5")).click();

		addNewProject.setDiyottaMenus(driver);
		addNewProject.setAdminMenu(driver);
		addNewProject.setProjectMenu(driver);
		addNewProject.setNewProjectButton(driver);
		addNewProject.setNormalProjectBtn(driver);
		addNewProject.setNewProjectName(driver, "Project_Selenium");
		addNewProject.setNewProjectCode(driver, "2662");
		addNewProject.setNewProjectDescription(driver, "Project_Selenium");
		addNewProject.setAddLayers(driver);
		addNewProject.setLayer(driver);
		addNewProject.setNewProjectSaveBtn(driver);
		addNewProject.setProjectMenu(driver);
	}
}
