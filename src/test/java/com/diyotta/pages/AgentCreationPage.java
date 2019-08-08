package com.diyotta.pages;

import org.openqa.selenium.By;

public class AgentCreationPage {
	public By di_Suite = By.xpath("//a[@title='DI Suite']");
	public By admin = By.xpath("//li[@id='admin']");
	public By expand=By.xpath("//li[@title='Expand']");
//	public By agents=By.xpath("//img[@src='svg-icons/admin/agents.svg']");
	public By agents=By.xpath("//span[text()='Agents']");
//	public By agents=By.xpath("//div[@class='admin-menu-scroll']/li[5]");
    public By newAgent=By.xpath("//span[text()='New']");
    public By agentName=By.id("inputControl_1");
    public By agentHost=By.id("inputControl_4");
    public By agentPort=By.id("inputControl_8");
    public By agentSave=By.xpath("//img[@alt='Save']");
 
    
	

	
	public By forcible_login =By.xpath("//div[@id='loginForciblePopupId']/div/div[3]/div/button[2]");
	

}
