package com.diyotta.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddNewProject {
	WebDriver driver;
	public By diyottaMenus = By.xpath("//a[@ui-sref='project.dashboard']");
	public By adminMenu = By.xpath("//*[@id='admin']/a[@ui-sref='admin.dashboard']");
	public By organizationMenu = By.xpath("//a[@title='Organizations']");
	public By projectMenu = By.xpath("//a[@title='Projects'][1]/img");
	public By newProjectButton = By.xpath("//button[@title='New']");
	public By normalProjectBtn = By.xpath("//a[@title='New Project']");
	public By newProjectName = By.id("inputControl_1");
	public By newProjectCode = By.id("inputControl_6");
	public By newProjectDescription = By.id("inputControl_2");
	public By newProjectSaveBtn = By.xpath("//button[@title='Save']");
	
	public void  login(WebDriver driver){
		this.driver = driver;
	}

	public void setdiyottaMenus() {

		driver.findElement(diyottaMenus).click();

	}

}
