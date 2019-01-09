package io.customertimes.automation.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.customertimes.automation.pages.DuplicateRulesPage;

public class DuplicateRulesSteps {

    DuplicateRulesPage duplicateRulesPage = new DuplicateRulesPage();

    @Then("^duplicate rules page is opened$")
    public void duplicateRulesPageIsOpened() {

    }

    @When("^user clicks on \"([^\"]*)\" button$")
    public void userClicksOnButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^new duplicate rule page is opened$")
    public void newDuplicateRulePageIsOpened() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user populate the fields of new rule$")
    public void userPopulateTheFieldsOfNewRule() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user clicks on the button 'Save'$")
    public void userClicksOnTheButtonSave() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^new duplicate rule details are opened$")
    public void newDuplicateRuleDetailsAreOpened() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
