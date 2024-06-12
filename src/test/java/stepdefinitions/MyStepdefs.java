package stepdefinitions;

import actions.LoginActions;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class MyStepdefs {
    private final LoginActions loginActions = new LoginActions();

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginActions.landing();
    }

    @When("I login as a {string}")
    public void iLoginAsA(String role) {
        loginActions.login(role);
    }

    @Then("I should see the homepage")
    public void iShouldSeeTheHomepage() {
        assertTrue("Text not found!", loginActions.checkHomepage().contains("Swag Labs"));
    }

    @After
    public void tearDown() {
        loginActions.closeBrowser();
    }

    @And("I see the label {string}")
    public void iSeeTheLabel(String label) {
        assertTrue("Text not found!", loginActions.checkLabel().contains(label));
    }
}
