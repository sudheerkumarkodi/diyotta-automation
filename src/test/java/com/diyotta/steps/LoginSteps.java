package com.diyotta.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("I am in diyotta login page")
	public void i_am_in_diyotta_login_page() {
		System.out.println("URL");
	}

	@Then("I enter username {string} and password {string}")
	public void i_enter_username_and_password(String userName, String password) {
		System.out.println("Login");
	}

	@When("I click on Login button")
	public void i_click_on_Login_button() {
		System.out.println("LoginButton");
	}

	@Then("I should be in home page")
	public void i_should_be_in_home_page() {
		System.out.println("Home Page");
	}

	@Then("I should see the error message {string}")
	public void i_should_see_the_error_message(String string) {

	}

}
