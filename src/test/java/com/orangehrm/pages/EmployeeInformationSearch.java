package com.orangehrm.pages;

import org.openqa.selenium.By;

public class EmployeeInformationSearch {
	
	public By txtUserName = By.id("inputControl_1");
	public By txtPassword = By.id("inputControl_2");
	public By loginButton = By.id("inputControl_5");
	
	public By orangeHrmUname = By.id("txtUsername");
	public By orangeHrmPwd = By.id("txtPassword");
	
	public By pimMenu = By.id("menu_pim_viewPimModule");
	public By empName = By.id("empsearch_employee_name_empName");
	public By empId = By.id("empsearch_id");
	public By empsearchSupervisorName = By.id("empsearch_supervisor_name");
	public By searchBtn = By.id("searchBtn");
	public By welcome = By.id("welcome");
	public By logout = By.xpath("//*[@id='welcome-menu']/ul/li[2]/a");	
			
	

	
}
