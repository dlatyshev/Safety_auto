package io.customertimes.automation.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.customertimes.automation.pages.CasePage;
import io.customertimes.automation.pages.HomePage;
import io.customertimes.automation.utilities.TestUtils;
import org.testng.Assert;

public class CaseSteps extends TestUtils {

    private CasePage casePage = new CasePage();
    private HomePage homePage = new HomePage();

    @When("^user clicks resent opened case$")
    public void userClicksResentOpenedCase() {
        homePage.selectRecentRecords().clickOnCase();
    }

    @Then("^Case navigation is present$")
    public void caseNavigationIsPresent() {
        Assert.assertTrue(casePage.selectCaseNavigation().isOpened());
    }

    @Then("^Milestones is present$")
    public void milestonesIsPresent() {
        Assert.assertTrue(casePage.selectMilestones().isOpened());
    }

    @Then("^Possible duplication is present$")
    public void possibleDuplicationIsPresent() {
        Assert.assertTrue(casePage.selectPossibleDuplicates().isOpened());
    }

    @Then("^Header bunner is present$")
    public void headerBunnerIsPresent() {
        Assert.assertTrue(casePage.selectHeaderBunner().isOpened());
    }

    @Then("^Source document is present$")
    public void sourceDocumentIsPresent() {
        Assert.assertTrue(casePage.selectSourceDocumentPage().isOpened());
    }
}
