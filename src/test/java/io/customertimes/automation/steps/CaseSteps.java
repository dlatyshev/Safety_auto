package io.customertimes.automation.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.customertimes.automation.pages.CasePage;
import io.customertimes.automation.pages.HomePage;
import io.customertimes.automation.utilities.TestUtils;

public class CaseSteps extends TestUtils {

    private CasePage casePage = new CasePage();
    private HomePage homePage = new HomePage();

    @When("^user clicks resent opened case$")
    public void user_clicks_resent_opened_case() {
        homePage.selectRecentRecords().clickOnCase();
    }

    @Then("^Case navigation is present$")
    public void case_navigation_is_present() {
        casePage.selectCaseNavigation().isOpened();
    }

    @Then("^Milestones is present$")
    public void milestones_is_present() {
        casePage.selectMilestones().isOpened();
    }

    @Then("^Possible duplication is present$")
    public void possible_duplication_is_present() {
        casePage.selectPossibleDuplicates().isOpened();
    }

    @Then("^Header bunner is present$")
    public void header_bunner_is_present() {
        casePage.selectHeaderBunner().isOpened();
    }

    @Then("^Source document is present$")
    public void source_document_is_present() {
        casePage.selectSourceDocumentPage().isOpened();
    }
}
