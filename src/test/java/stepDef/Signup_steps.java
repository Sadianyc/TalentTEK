package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Signup_page;

public class Signup_steps extends Config {
    Signup_page signup = new Signup_page(driver);
    @And("I get title of the page")
    public void iGetTitleOfThePage() {
        signup.pageTitle();
    }

    @And("I click on Create New Account button")
    public void iClickOnCreateNewAccountButton() {
        signup.clickOnNewAccount();
        
    }

    @And("I filled out the form with valid information")
    public void iFilledOutTheFormWithValidInformation() {
        
    }

    @And("I clicked on agree checkbox")
    public void iClickedOnAgreeCheckbox() {
        
    }

    @When("I click Create My Account button")
    public void iClickCreateMyAccountButton() {
        
    }

    @Then("I will verify Thank you message")
    public void iWillVerifyThankYouMessage() {
    }
}
