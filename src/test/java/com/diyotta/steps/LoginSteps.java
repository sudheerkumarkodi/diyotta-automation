package com.diyotta.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("^I am in diyotta login page$")
	public void i_am_in_diyotta_login_page() throws Throwable {
		System.out.println("URL");
	}

	@When("^I click on Login button$")
	public void i_click_on_login_button() throws Throwable {
		System.out.println("Login");
	}

	@Then("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		System.out.println("username and password");
	}

	@Then("^I should be in home page$")
	public void i_should_be_in_home_page() throws Throwable {
		System.out.println("home page");
	}

	@Then("^I should see the error message \"([^\"]*)\"$")
	public void i_should_see_the_error_message_something(String errormessage) throws Throwable {
		System.out.println("error message");
	}

	/*
	 * @Given("I am in diyotta login page") public void
	 * i_am_in_diyotta_login_page() { System.out.println("URL"); }
	 * 
	 * @Then("I enter username {string} and password {string}") public void
	 * i_enter_username_and_password(String userName, String password) {
	 * System.out.println("Login"); }
	 * 
	 * @When("I click on Login button") public void i_click_on_Login_button() {
	 * System.out.println("LoginButton"); }
	 * 
	 * @Then("I should be in home page") public void i_should_be_in_home_page()
	 * { System.out.println("Home Page"); }
	 * 
	 * @Then("I should see the error message {string}") public void
	 * i_should_see_the_error_message(String string) {
	 * 
	 * }
	 */

}
