package stepdefinitions;

import actions.LoginActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    private final LoginActions loginActions = new LoginActions();

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginActions.landing();
    }

    @When("I login as a standard user")
    public void iLoginAsAStandardUser() {
    }

    @Then("I should be authorized")
    public void iShouldBeAuthorized() {
    }

    @And("I should see the homepage")
    public void iShouldSeeTheHomepage() {
    }
}
