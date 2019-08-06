package com.diyotta.pages;

import org.openqa.selenium.By;

public class AgentCreationPage {
	public By di_Suite = By.xpath("//a[@title='DI Suite']");
	public By admin = By.xpath("//li[@id='admin']");
	public By expand=By.xpath("//li[@title='Expand']");
	public By agents=By.xpath("//img[@src='svg-icons/admin/agents.svg']");
	public By newAgent=By.xpath("//img[@alt='New']");
	
	
	
	public By forcible_login =By.xpath("//div[@id='loginForciblePopupId']/div/div[3]/div/button[2]");
	

}
