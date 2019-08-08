package com.diyotta.pages;

import org.openqa.selenium.By;

public class AgentGroup {
	public By agent_group = By.linkText("Agent Groups");
	public By new_agent_group = By.xpath("//div[@title = 'New']");
	public By agent_group_name = By.id("inputControl_1");
	public By add_agent = By.xpath("//*[@title ='Add Agent']");
	public By assign_agent_tab = By.linkText("Assign Agents");
	public By select_agent = By.xpath("//a[@title ='aqabuild']");
	public By assign_projects_tab = By.linkText("Assign Projects");
	public By add_project = By.xpath("//*[@title ='Add Agent']");
	public By select_project = By.linkText("STUDIO_DASHBOARD");
	public By save_agent_group = By.xpath("//button[@title ='Save']");
	
	

}
