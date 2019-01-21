package io.customertimes.automation.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.customertimes.automation.pages.CaseMerge;
import io.customertimes.automation.pages.CasePage;
import io.customertimes.automation.pages.CasesListViewPage;
import io.customertimes.automation.pages.HomePage;
import io.customertimes.automation.utilities.TestUtils;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;

public class CaseSteps extends TestUtils {

    private CasePage casePage = new CasePage();
    private HomePage homePage = new HomePage();
    private CasesListViewPage casesListViewPage = new CasesListViewPage();
    private CasePage.PossibleDuplicates possibleDuplicates;
    private CaseMerge caseMerge;
    private SoftAssert softAssert = new SoftAssert();

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

    @When("^user clicks on the button 'Select For Merge'$")
    public void userClicksOnTheButtonSelectForMerge() {
        casePage.selectPossibleDuplicatesSection().clickSelectForMergeButton();
    }

    @When("^user clicks on the button 'Merge'$")
    public void userClicksOnTheButtonMerge() {
        caseMerge = casePage.selectPossibleDuplicatesSection().clickMergeButton();
    }

    @Then("^case merge page is opened$")
    public void caseMergePageIsOpened() {
        Assert.assertTrue(caseMerge.isOpened());
    }

    @Then("^all required buttons are displayed$")
    public void allRequiredButtonsAreDisplayed() {
        HashMap<String, Boolean> buttons = caseMerge.allRequiredButtonsAreDisplayed();
        for (HashMap.Entry pair : buttons.entrySet()) {
            softAssert.assertTrue((boolean)pair.getValue(), pair.getKey() + " is not displayed");
        }
    }

    @Then("^all required fields are displayed$")
    public void allRequiredFieldsAreDisplayed() {
        HashMap<String, Boolean> fields = caseMerge.allRequiredFieldsAreDisplayed();
        for (HashMap.Entry pair : fields.entrySet()) {
            softAssert.assertTrue((boolean)pair.getValue(), pair.getKey() + " is not displayed");
        }
    }

    @Then("^all required checkboxes are displayed$")
    public void allRequiredCheckboxesAreDisplayed() {
        Assert.assertTrue(caseMerge.allRequiredCheckboxesAreDisplayed());
        softAssert.assertAll();
    }
}
