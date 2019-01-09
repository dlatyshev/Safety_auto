package io.customertimes.automation.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.customertimes.automation.pages.DuplicateRule;
import io.customertimes.automation.pages.DuplicateRulesPage;
import io.customertimes.automation.pages.NewDuplicateRuleRecordPage;
import org.testng.Assert;

public class DuplicateRulesSteps {

    private DuplicateRulesPage duplicateRulesPage = new DuplicateRulesPage();
    private NewDuplicateRuleRecordPage newDuplicateRuleRecordPage = null;
    private DuplicateRule duplicateRule = null;


    @Then("^duplicate rules page is opened$")
    public void duplicateRulesPageIsOpened() {
        Assert.assertTrue(duplicateRulesPage.isOpened());
    }

    @When("^user clicks on button 'New'$")
    public void userClicksOnButtonNew() {
        newDuplicateRuleRecordPage = duplicateRulesPage.clickOnTheButtonNew();
    }

    @Then("^new duplicate rule page is opened$")
    public void newDuplicateRulePageIsOpened() {
        Assert.assertTrue(newDuplicateRuleRecordPage.isOpened());
    }

    @When("^user populate the fields of new rule$")
    public void userPopulateTheFieldsOfNewRule() {
        newDuplicateRuleRecordPage.populateAllFields();
    }

    @When("^user clicks on the button 'Save'$")
    public void userClicksOnTheButtonSave() {
       duplicateRule =  newDuplicateRuleRecordPage.saveNewRule();
    }

    @Then("^new duplicate rule details are opened$")
    public void newDuplicateRuleDetailsAreOpened() {
       Assert.assertTrue(duplicateRule.isOpened());
    }
}
