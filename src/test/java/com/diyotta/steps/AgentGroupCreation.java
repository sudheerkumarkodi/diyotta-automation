package com.diyotta.steps;

import com.diyotta.pages.AgentGroup;

import com.diyotta.pages.LoginPage;
import com.diyotta.tests.CommonTestMethods;

public class AgentGroupCreation extends CommonTestMethods {

	LoginPage loginPage = new LoginPage();
	AgentGroup agentgroup = new AgentGroup();
	
	public void launchBrowserAndEnterUrl() {
		launchDiyottaAppURL();
		
	}
	
	public void enterUsernameAndPassword(String usrname, String password ) {
		
		getDriver().findElement(loginPage.txtUserName).sendKeys(usrname);;
		getDriver().findElement(loginPage.txtPassword).sendKeys(password);;
	}
	
	public void clickOnLoginButton() {
		getDriver().findElement(loginPage.loginButton);
	}
	
	public void switchModule() {
	shiftModule("ADMIN");
	}
	
	public void clickAgentGroup() {
		getDriver().findElement(agentgroup.agent_group).click();
	}
	
	public void clickOnNew() {
		getDriver().findElement(agentgroup.new_agent_group).click();
	}
	
	public void enterAgentGroupName() {
		getDriver().findElement(agentgroup.agent_group_name).sendKeys("agrp_1234");
	}
	
	public void assignagents() {
		getDriver().findElement(agentgroup.assign_agent_tab).click();
		getDriver().findElement(agentgroup.add_agent).click();
		getDriver().findElement(agentgroup.select_agent).click();
	}
	
	public void assignProject() {
		getDriver().findElement(agentgroup.assign_projects_tab).click();
		getDriver().findElement(agentgroup.add_project).click();
		getDriver().findElement(agentgroup.select_project).click();
	}
	
	public void clickOnSave() {
		getDriver().findElement(agentgroup.save_agent_group).click();
	}
	
	public void logOutAndClose() {
		logout();
		closeBrowser();
	}
	
}
