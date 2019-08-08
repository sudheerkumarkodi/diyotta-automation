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

}
