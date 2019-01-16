package io.customertimes.automation.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.customertimes.automation.pages.CasePage;
import io.customertimes.automation.pages.CasesListViewPage;
import io.customertimes.automation.pages.HomePage;
import io.customertimes.automation.utilities.TestUtils;
import org.testng.Assert;

public class CaseSteps extends TestUtils {

    private CasePage casePage = new CasePage();
    private HomePage homePage = new HomePage();
    private CasesListViewPage casesListViewPage = new CasesListViewPage();
    private CasePage.PossibleDuplicates possibleDuplicates;

    @Then("^Case navigation is present$")
    public void caseNavigationIsPresent() {
        Assert.assertTrue(casePage.selectCaseNavigationSection().isOpened());
    }

    @Then("^Milestones is present$")
    public void milestonesIsPresent() {
        Assert.assertTrue(casePage.selectMilestonesSection().isOpened());
    }

    @Then("^Possible duplication is present$")
    public void possibleDuplicationIsPresent() {
        Assert.assertTrue(casePage.selectPossibleDuplicatesSection().isOpened());
    }

    @Then("^Header bunner is present$")
    public void headerBunnerIsPresent() {
        Assert.assertTrue(casePage.selectHeaderBunner().isOpened());
    }

    @Then("^Source document is present$")
    public void sourceDocumentIsPresent() {
        Assert.assertTrue(casePage.selectSourceDocumentSection().isOpened());
    }


    @When("^user chooses tha appropriate list view \"([^\"]*)\"$")
    public void userChoosesThaAppropriateListView(String listViewName) {
        casesListViewPage.selectListViewByName(listViewName);
    }

    @Then("^the list view is opened$")
    public void theListViewIsOpened() {
        Assert.assertTrue(casesListViewPage.isCasesListViewOpened());
    }

    @When("^user clicks on case number \"([^\"]*)\"$")
    public void userClicksOnCaseNumber(String number) {
        casePage = casesListViewPage.selectCaseByNumber(number);
    }

    @When("^user clicks the button 'Manual Search'$")
    public void userClicksTheButtonManualSearch() {
        possibleDuplicates = casePage.selectPossibleDuplicatesSection().clickManualSearchButton();
    }

    @When("^user clicks the button 'Find Duplicates'$")
    public void userClicksTheButtonFindDuplicates() {
        possibleDuplicates.clickFindDuplicatesButton();
    }

    @Then("^duplicate search results are opened$")
    public void duplicateSearchResultsAreOpened() {
        Assert.assertTrue(possibleDuplicates.duplicateSearchResultsAreOpened());
    }

    @When("^user clicks on recent record with name \"([^\"]*)\"$")
    public void userClicksOnRecentRecordWithName(String name) {
        homePage.getRecentRecords().clickOnRecentRecord(name);
    }
}
