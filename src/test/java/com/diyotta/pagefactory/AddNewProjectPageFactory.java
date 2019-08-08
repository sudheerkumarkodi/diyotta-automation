package com.diyotta.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.diyotta.drivers.DriverCreation;
import com.diyotta.tests.CommonTestMethods;

public class AddNewProjectPageFactory {
	DriverCreation driverCreation = new DriverCreation();
	CommonTestMethods commonTestMethods = new CommonTestMethods();

	public AddNewProjectPageFactory() {
		PageFactory.initElements(commonTestMethods.getDriver(), this);
	}

	@FindBy(xpath = "//a[@ui-sref='project.dashboard']")
	@CacheLookup
	public WebElement diyottaMenus;

	@FindBy(xpath = "//*[@id='admin']/a[@ui-sref='admin.dashboard']")
	public WebElement adminMenu;
	
	@FindBy(xpath = "//a[@title='Projects'][1]/img")
	public WebElement projectMenu;
	
	
	@FindBy(xpath = "//button[@title='New']")
	public WebElement newProjectButton;
	
	@FindBy(xpath = "//a[@title='New Project']")
	public WebElement normalProjectBtn;
	
	@FindBy(id = "inputControl_1")
	public WebElement newProjectName;
	
	@FindBy(id = "inputControl_6")
	public WebElement newProjectCode;
	
	@FindBy(id = "inputControl_2")
	public WebElement newProjectDescription;
	
	@FindBy(xpath = "//a[contains(text(),'Add Layers')]")
	public WebElement addLayers;
	
	@FindBy(xpath = "//span[@title='Add Layer']")
	public WebElement layer;
	
	@FindBy(xpath = "//button[@title='Save']")
	public WebElement newProjectSaveBtn;

	public void clickDiyottaMenus() {
		driverCreation.getWebActions().click(diyottaMenus);
	}

	public void clickAdminMenu() {
		driverCreation.getWebActions().click(adminMenu);
	}
	
	public void clickProjectMenu() {
		driverCreation.getWebActions().click(projectMenu);
	}
	
	public void clickNewProjectButton() {
		driverCreation.getWebActions().click(newProjectButton);
	}
	
	public void clickNormalProjectBtn() {
		driverCreation.getWebActions().click(normalProjectBtn);
	}
	
	public void clickNewProjectName() {
		driverCreation.getWebActions().click(newProjectName);
	}

	public void clickNewProjectCode() {
		driverCreation.getWebActions().click(newProjectCode);
	}
	
	public void clickNewProjectDescription() {
		driverCreation.getWebActions().click(newProjectDescription);
	}
	
	public void clickAddLayers() {
		driverCreation.getWebActions().click(addLayers);
	}
	
	public void clickOnLayer() {
		driverCreation.getWebActions().click(layer);
	}
	
	public void clickNewProjectSaveBtn() {
		driverCreation.getWebActions().click(newProjectSaveBtn);
	}
}
