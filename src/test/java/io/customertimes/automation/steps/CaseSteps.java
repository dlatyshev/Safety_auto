package io.customertimes.automation.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.customertimes.automation.pages.CasePage;
import io.customertimes.automation.pages.CasesListViewPage;
import io.customertimes.automation.pages.HomePage;
import io.customertimes.automation.utilities.TestUtils;
import org.testng.Assert;

public class CaseSteps extends TestUtils {

    private CasePage casePage;
    private HomePage homePage;
    private CasesListViewPage casesListViewPage;

    @When("^user clicks resent opened case$")
    public void userClicksResentOpenedCase() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        homePage.getRecentRecords().clickOnCase();
    }

    @Then("^Case navigation is present$")
    public void caseNavigationIsPresent() {
        if (casePage == null) {
            casePage = new CasePage();
        }
        Assert.assertTrue(casePage.selectCaseNavigation().isOpened());
    }

    @Then("^Milestones is present$")
    public void milestonesIsPresent() {
        if (casePage == null) {
            casePage = new CasePage();
        }
        Assert.assertTrue(casePage.selectMilestones().isOpened());
    }

    @Then("^Possible duplication is present$")
    public void possibleDuplicationIsPresent() {
        if (casePage == null) {
            casePage = new CasePage();
        }
        Assert.assertTrue(casePage.selectPossibleDuplicates().isOpened());
    }

    @Then("^Header bunner is present$")
    public void headerBunnerIsPresent() {
        if (casePage == null) {
            casePage = new CasePage();
        }
        Assert.assertTrue(casePage.selectHeaderBunner().isOpened());
    }

    @Then("^Source document is present$")
    public void sourceDocumentIsPresent() {
        if (casePage == null) {
            casePage = new CasePage();
        }
        Assert.assertTrue(casePage.selectSourceDocumentPage().isOpened());
    }


    @When("^user chooses tha appropriate list view \"([^\"]*)\"$")
    public void userChoosesThaAppropriateListView(String listViewName) {
        if (casesListViewPage == null) {
            casesListViewPage = new CasesListViewPage();
        }
        casesListViewPage.selectListViewByName(listViewName);
    }

    @Then("^the list view is opened$")
    public void theListViewIsOpened() {
        if (casesListViewPage == null) {
            casesListViewPage = new CasesListViewPage();
        }
        Assert.assertTrue(casesListViewPage.isCasesListViewOpened());
    }
}
