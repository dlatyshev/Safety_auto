package io.customertimes.automation.steps;

import cucumber.api.java.en.Then;
import io.customertimes.automation.pages.HomePage;
import org.testng.Assert;

public class HomeSteps {

    private HomePage homePage = new HomePage();

    @Then("^Dashboard is present$")
    public void dashboardIsPresent() {
        Assert.assertTrue(homePage.selectDashboard().isOpened());
    }

    @Then("^Chatter is present$")
    public void chatterIsPresent() {
        Assert.assertTrue(homePage.selectChater().isOpened());
    }

    @Then("^Recent Records is present$")
    public void recentRecordsIsPresent() {
        Assert.assertTrue(homePage.selectRecentRecords().isOpened());
    }

    @Then("^Case candidate is present$")
    public void caseCandidateIsPresent() {
        Assert.assertTrue(homePage.selectCaseCandidates().isOpened());
    }
}
