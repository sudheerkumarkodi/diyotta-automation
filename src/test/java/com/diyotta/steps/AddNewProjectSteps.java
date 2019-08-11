package com.diyotta.steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.diyotta.constants.TestConstants;
import com.diyotta.pagefactory.AddNewProjectPageFactory;
import com.diyotta.pages.AddNewProject;
import com.diyotta.tests.CommonTestMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewProjectSteps {

	CommonTestMethods commonTestMethods = new CommonTestMethods();
	AddNewProject addNewProject = new AddNewProject();
	AddNewProjectPageFactory addNewProjectPageFactory = new AddNewProjectPageFactory();

	@Given("^I am launching the browser$")
	public void i_am_launching_the_browser() throws Throwable {
		commonTestMethods.launchDiyottaAppURL();
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
		commonTestMethods.login(TestConstants.DI_USERNAME, TestConstants.DI_PASSWORD);
	}

	@Then("^I click on Diyotta Menus$")
	public void i_click_on_diyotta_menus() throws Throwable {
		commonTestMethods.getDriver().findElement(addNewProject.diyottaMenus).click();
	}

	@Then("^I click on Admin Menu$")
	public void i_click_on_admin_menu() throws Throwable {
		commonTestMethods.getDriver().findElement(addNewProject.adminMenu).click();
	}

	@Then("^I click on project icon$")
	public void i_click_on_project_icon() throws Throwable {
		Thread.sleep(10000);
		commonTestMethods.getDriver().findElement(addNewProject.projectMenu).click();
	}

	@Then("^I click on New project button$")
	public void i_click_on_new_project_button() throws Throwable {
		commonTestMethods.getDriver().findElement(addNewProject.newProjectButton).click();
	}

	@Then("^I select Normal project drop down$")
	public void i_select_normal_project_drop_down() throws Throwable {
		WebElement webElement = commonTestMethods.getDriver().findElement(addNewProject.normalProjectBtn);
		Actions act = new Actions(commonTestMethods.getDriver());
		act.moveToElement(webElement).perform();
		webElement.click();
	}

	@Then("^I have given project name$")
	public void i_have_given_project_name() throws Throwable {
		commonTestMethods.getDriver().findElement(addNewProject.newProjectName).sendKeys(TestConstants.AD_PROJECT_NAME);
	}

	@Then("^I have given project code$")
	public void i_have_given_project_code() throws Throwable {
		commonTestMethods.getDriver().findElement(addNewProject.newProjectCode).sendKeys(TestConstants.AD_PROJECT_CODE);
	}

	@Then("^I have given project description$")
	public void i_have_given_project_description() throws Throwable {
		commonTestMethods.getDriver().findElement(addNewProject.newProjectDescription).sendKeys(TestConstants.AD_PROJECT_DESC);
	}

	@Then("^I click on Add layer menu$")
	public void i_click_on_add_layer_menu() throws Throwable {
		commonTestMethods.getDriver().findElement(addNewProject.addLayers).click();
	}

	@Then("^I click on Add layer Plus icon$")
	public void i_click_on_add_layer_plus_icon() throws Throwable {
		commonTestMethods.getDriver().findElement(addNewProject.layer).click();
	}

	@Then("^I click on save button$")
	public void i_click_on_save_button() throws Throwable {
		commonTestMethods.getDriver().findElement(addNewProject.newProjectSaveBtn).click();
	}

	@Then("^I click on Logout button and close button$")
	public void i_click_on_logout_button_and_close_button() throws Throwable {
		Thread.sleep(5000);
		commonTestMethods.logout();
	}

	@Then("^I should be able to close the browser$")
	public void i_should_be_able_to_close_the_browser() throws Throwable {
		commonTestMethods.closeBrowser();
	}

}
