package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class Steps {
    LoginPage login  = new LoginPage();

    @Given("^I am on the login page$")
    public void i_am_on_the_login_page() {
       login.navigateToLogin();
       login.clickLogin();
    }

    @When("^I login with valid credentials$")
    public void i_login_with_valid_credentials() {
        //Enter code to continue
        System.out.println("Enter search criteria");
    }

    @Then("I should be redirected to the products page$")
    public void I_should_be_redirected_to_products_page() {
        //Enter code to continue
        System.out.println("Click on search button");
    }

    @When("I login with invalid credentials")
    public void i_login_with_invalid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Invalid data");
    }
    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("A message  something happens here ");
    }

    @Given("I am logged in")
    public void i_am_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I logout from the home page")
    public void i_logout_from_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should be redirected to the login page")
    public void i_should_be_redirected_to_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
