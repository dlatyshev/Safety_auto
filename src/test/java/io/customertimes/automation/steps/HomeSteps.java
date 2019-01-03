package io.customertimes.automation.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.customertimes.automation.pages.HomePage;

public class HomeSteps {

    private HomePage homePage = new HomePage();

    @When("^user clicks on any name of the 'Source Document'$")
    public void user_clicks_on_any_name_of_the_Source_Document() {
        homePage.selectSourceDocumentFromTheList(1);
    }

    @Then("^Dashboard is present$")
    public void dashboard_is_present() {
        homePage.selectDashboard().isOpened();
    }

    @Then("^Source document list is present$")
    public void source_document_list_is_present() {
        homePage.selectSourceDocument().isOpened();
    }

    @Then("^Chatter is present$")
    public void chatter_is_present() {
        homePage.selectChater().isOpened();
    }

    @Then("^Recent Records is present$")
    public void recent_Records_is_present() {
        homePage.selectRecentRecords().isOpened();
    }
}
