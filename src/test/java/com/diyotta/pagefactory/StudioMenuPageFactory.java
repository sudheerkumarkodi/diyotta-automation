package com.diyotta.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.diyotta.drivers.DriverCreation;

public class StudioMenuPageFactory {

	DriverCreation driverCreation = new DriverCreation();

	public StudioMenuPageFactory() {
		PageFactory.initElements(driverCreation.getDriver(), this);
	}

	@FindBy(xpath = "//li[@class='bg-none']")
	public WebElement expandMenu;

	@FindBy(xpath = "//a[@class='pull-right padding-right-medium']")
	public WebElement collapseMenu;

	@FindBy(xpath = "//img[contains(@src, 'svg-icons/common/home.svg')]")
	public WebElement homeCollapse;

	@FindBy(xpath = "//span[contains(text(),'Home')]")
	public WebElement homeExpand;

	@FindBy(xpath = "//div[@class='admin-menu-scroll']//span[contains(text(),'Data Point')]")
	public WebElement dataPointExpand;

	@FindBy(xpath = "//img[contains(@src, 'svg-icons/main-dashboard/data_point_copy.svg')]")
	public WebElement dataPointCollapse;

	@FindBy(xpath = "//div[@class='admin-menu-scroll']//span[contains(text(),'Data Object')]")
	public WebElement dataObjectExpand;

	@FindBy(xpath = "//img[contains(@src, 'svg-icons/common/data_object.svg')]")
	public WebElement dataObjectCollapse;

	@FindBy(xpath = "//div[@class='admin-menu-scroll']//span[contains(text(),'Data Flow')]")
	public WebElement dataFlowExpand;

	@FindBy(xpath = "//img[contains(@src, 'svg-icons/common/dataflow2.svg')]")
	public WebElement dataFlowCollapse;

	@FindBy(xpath = "//div[@class='admin-menu-scroll']//span[contains(text(),'Job Flow')]")
	public WebElement jobFlowExpand;

	@FindBy(xpath = "//img[contains(@src, 'svg-icons/common/jobflow.svg')]")
	public WebElement jobFlowCollapse;

	@FindBy(xpath = "//div[@class='admin-menu-scroll']//span[contains(text(),'SQL Editor')]")
	public WebElement sqlEditorExpand;

	@FindBy(xpath = "//img[contains(@src, 'svg-icons/common/sql_editor.svg')]")
	public WebElement sqlEditorCollapse;

	public void expandCollapseMenu() {
		if (expandMenu != null)
			driverCreation.getWebActions().click(expandMenu);
		else
			driverCreation.getWebActions().click(collapseMenu);
	}

	public void studioHomeMenu() {
		// if (expandMenu != null)
		driverCreation.getWebActions().click(homeCollapse);
		// else
		// driverCreation.getWebActions().click(homeExpand);
	}

	public void dataPointMenu() {
		if (expandMenu != null)
			driverCreation.getWebActions().click(dataPointExpand);
		else
			driverCreation.getWebActions().click(dataPointCollapse);
	}

	public void dataObjectMenu() {
		if (expandMenu != null)
			driverCreation.getWebActions().click(dataObjectExpand);
		else
			driverCreation.getWebActions().click(dataObjectCollapse);
	}

	public void dataFlowMenu() {
		if (expandMenu != null)
			driverCreation.getWebActions().click(dataFlowExpand);
		else
			driverCreation.getWebActions().click(dataFlowCollapse);
	}

	public void jobFlowMenu() {
		if (expandMenu != null)
			driverCreation.getWebActions().click(jobFlowExpand);
		else
			driverCreation.getWebActions().click(jobFlowCollapse);
	}

	public void sqlEditorMenu() {
		if (expandMenu != null)
			driverCreation.getWebActions().click(sqlEditorExpand);
		else
			driverCreation.getWebActions().click(sqlEditorCollapse);
	}

}
