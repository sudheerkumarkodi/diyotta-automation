package com.diyotta.steps;

import com.diyotta.pagefactory.AddNewProjectPageFactory;
import com.diyotta.pagefactory.AddNewUserPageFactory;
import com.diyotta.pages.AddNewProject;
import com.diyotta.tests.AddNewUser;
import com.diyotta.tests.CommonTestMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserCreationSteps {
	
	CommonTestMethods commonTestMethods = new CommonTestMethods();
	AddNewUser addNewUser = new AddNewUser();
	AddNewUserPageFactory addNewUserPageFactory = new AddNewUserPageFactory();
	
    @When("^After launch the browser I am in Login Page$")
    public void after_launch_the_browser_i_am_in_login_page() throws Throwable {

    }
	
    @Given("^Username and password$")
    public void username_and_password() throws Throwable {

    }
    
    @And("^I click on Admin Module$")
    public void i_click_on_admin_module() throws Throwable {

    }

    @Given("^All Required fields$")
    public void all_required_fields() throws Throwable {

    }


    @Then("^I click on Main Menu$")
    public void i_click_on_main_menu() throws Throwable {

    }

    @Then("^I go to User Tab$")
    public void i_go_to_user_tab() throws Throwable {

    }

    @Then("^I Click on new User$")
    public void i_click_on_new_user() throws Throwable {

    }

    @Then("^save$")
    public void save() throws Throwable {

    }

    @Then("^logout$")
    public void logout() throws Throwable {

    }

    @And("^close the browser$")
    public void close_the_browser() throws Throwable {

    }

}
