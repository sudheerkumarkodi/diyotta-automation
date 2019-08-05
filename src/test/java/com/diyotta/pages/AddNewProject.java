package com.diyotta.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddNewProject {

	public By diyottaMenus = By.xpath("//a[@ui-sref='project.dashboard']");
	public By adminMenu = By.xpath("//*[@id='admin']/a[@ui-sref='admin.dashboard']");
	public By organizationMenu = By.xpath("//a[@title='Organizations']");
	public By projectMenu = By.xpath("//a[@title='Projects'][1]/img");
	public By newProjectButton = By.xpath("//button[@title='New']");
	public By normalProjectBtn = By.xpath("//a[@title='New Project']");
	public By newProjectName = By.id("inputControl_1");
	public By newProjectCode = By.id("inputControl_6");
	public By newProjectDescription = By.id("inputControl_2");
	public By addLayers = By.xpath("//a[contains(text(),'Add Layers')]");
	public By layer = By.xpath("//span[@title='Add Layer']");
	public By newProjectSaveBtn = By.xpath("//button[@title='Save']");
	

	public void setDiyottaMenus(WebDriver driver) {

		driver.findElement(diyottaMenus).click();

	}

	public void setAdminMenu(WebDriver driver) {

		driver.findElement(adminMenu).click();

	}

	public void setProjectMenu(WebDriver driver) throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(projectMenu).click();

	}

	public void setNewProjectButton(WebDriver driver) {

		driver.findElement(newProjectButton).click();

	}

	public void setNormalProjectBtn(WebDriver driver) {

		 WebElement webElement = driver.findElement(normalProjectBtn);
			Actions act = new Actions(driver);
			act.moveToElement(webElement).perform();
			webElement.click();

	}

	public void setNewProjectName(WebDriver driver,String projectName) {

		driver.findElement(newProjectName).sendKeys("manoj751");

	}

	public void setNewProjectCode(WebDriver driver,String projectCode) {

		driver.findElement(newProjectCode).sendKeys("manoj751");

	}

	public void setNewProjectDescription(WebDriver driver,String projectDescription) {

		driver.findElement(newProjectDescription).sendKeys("inputControl_2");

	}
	
	public void setAddLayers(WebDriver driver) {

		driver.findElement(addLayers).click();

	}
	
	public void setLayer(WebDriver driver) {

		driver.findElement(layer).click();

	}
	

	public void setNewProjectSaveBtn(WebDriver driver) {

		driver.findElement(newProjectSaveBtn).click();

	}

}
