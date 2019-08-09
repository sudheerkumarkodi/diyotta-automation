package com.diyotta.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AgentGroup_StepDefinition extends AgentGroupCreation {

	@Given("^I am in Diyotta Login Page by launch browser and enter diyotta url$")
	public void enterUrl() {
		launchBrowserAndEnterUrl();
	}

	@Then("^I enter username \"([^\"]*)\" and password \"([^\"]*)\" $")
	public void enterUsernameAndPassword(String usrname, String password) {
		enterUsernameAndPassword(usrname, password);
	}

	@When("^I click on login button$")
	public void clickOnLogin() {
		clickOnLoginButton();
	}

	@Then("^I should be in studio module$")
	public void diyottaStudio() {
		String studiotitle = getDriver().getTitle();
		System.out.println(studiotitle);
	}

	@When("^I click on Admin module$")
	public void clickOnAdmin() {
		switchModule();
	}

	@Then("^I should be in Admin Module$")
	public void diyotta_Admin() {
		String admintitle = getDriver().getTitle();
		System.out.println(admintitle);
	}

	@And("^I click on Agent Group tab $")
	public void clickAgentGroupTab() {
		clickAgentGroup();
	}

	@And("^I click on New in agnet list page$")
	public void i_click_on_new_in_agnet_list_page() {

		clickOnNew();
	}

	@And("^I enter Agent Group Name$")
	public void i_enter_agent_group_name() {

		enterAgentGroupName();
	}

	@And("^I assign agents$")
	public void i_assign_agents() {
		assignagents();
	}

	@And("^I assign project $")
	public void i_assign_project() {
		assignProject();
	}

	@Then("^I click on save$")
	public void i_click_on_save() {
		clickOnSave();
	}

	@And("^I logout from Diyotta Admin and close the browser$")
	public void i_logout_from_diyotta_admin_and_close_the_browser() {
		logOutAndClose();
	}

}
