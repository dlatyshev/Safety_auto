package io.customertimes.automation.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.customertimes.automation.pages.HomePage;

public class HomeSteps {

    private HomePage homePage = new HomePage();

    @Then("^Dashboard is present$")
    public void dashboard_is_present() {
        homePage.selectDashboard().isOpened();
    }

    @Then("^Chatter is present$")
    public void chatter_is_present() {
        homePage.selectChater().isOpened();
    }

    @Then("^Recent Records is present$")
    public void recent_Records_is_present() {
        homePage.selectRecentRecords().isOpened();
    }

    @Then("^Case candidate is present$")
    public void case_candidate_is_present() {
      homePage.selectCaseCandidates().isOpened();
    }
}
