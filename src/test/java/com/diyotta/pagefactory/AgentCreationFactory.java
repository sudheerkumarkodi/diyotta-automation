package com.diyotta.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.diyotta.drivers.DriverCreation;

public class AgentCreationFactory {
	DriverCreation driverCreation=new DriverCreation();
	
	public AgentCreationFactory()
	{
		PageFactory.initElements(driverCreation.getDriver(), this);
	}
	
	@FindBy(xpath = "//a[@title='DI Suite']")
	public WebElement di_Suite;
	
	@FindBy(xpath = "//li[@id='admin']")
	public WebElement admin;
	
	@FindBy(xpath = "//li[@title='Expand']")
	public WebElement expand;
	
	@FindBy(xpath = "//span[text()='Agents']")
	public WebElement agents;
	
	@FindBy(xpath = "//span[text()='New']")
	public WebElement newAgent;
	
	@FindBy(id = "inputControl_1")
	public WebElement agentName;
	
	@FindBy(id = "inputControl_4")
	public WebElement agentHost;
	
	@FindBy(id = "inputControl_8")
	public WebElement agentPort;
	
	@FindBy(xpath = "//img[@alt='Save']")
	public WebElement agentSave;

}
