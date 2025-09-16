package stepdefinitions;

import actions.Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class MyStepdefs {
    private final Actions actions = new Actions();

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        //TODO
    }

    @When("I login as a {string}")
    public void iLoginAsA(String role) {
        actions.login(role);
    }

    @Then("I should see the homepage")
    public void iShouldSeeTheHomepage() {
        assertTrue("Text not found!", actions.checkHomepage().contains("Swag Labs"));
    }

    @And("I see the label {string}")
    public void iSeeTheLabel(String label) {
        assertTrue("Text not found!", actions.checkLabel().contains(label));
    }
}