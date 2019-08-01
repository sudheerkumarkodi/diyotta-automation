package com.orangehrm.pages;

import org.openqa.selenium.By;

public class EmployeeInformationSearch {
	
	public By txtUserName = By.id("txtUsername");
	public By txtPassword = By.id("txtPassword");
	public By loginButton = By.xpath("//input[@name='Submit']");
	
	public By pimMenu = By.id("menu_pim_viewPimModule");
	public By empName = By.id("empsearch_employee_name_empName");
	public By empId = By.id("empsearch_id");
	public By empsearchSupervisorName = By.id("empsearch_supervisor_name");
	public By searchBtn = By.id("searchBtn");
	public By welcome = By.id("welcome");
	public By logout = By.xpath("//*[@id='welcome-menu']/ul/li[2]/a");	
			
	

	
}
