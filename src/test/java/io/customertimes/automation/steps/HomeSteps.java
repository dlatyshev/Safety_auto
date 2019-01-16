package io.customertimes.automation.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.customertimes.automation.pages.HomePage;
import org.testng.Assert;

public class HomeSteps {

    private HomePage homePage = new HomePage();

    @Then("^Dashboard is present$")
    public void dashboardIsPresent() {
        Assert.assertTrue(homePage.getDashboard().isOpened());
    }

    @Then("^Chatter is present$")
    public void chatterIsPresent() {
        Assert.assertTrue(homePage.selectChatter().isOpened());
    }

    @Then("^Recent Records is present$")
    public void recentRecordsIsPresent() {
        Assert.assertTrue(homePage.getRecentRecords().isOpened());
    }

    @Then("^Case candidates list is present$")
    public void caseCandidatesListIsPresent() {
        Assert.assertTrue(homePage.getCaseCandidates().isOpened());
    }

    @When("^user clicks name \"([^\"]*)\" of the source document$")
    public void userClicksNameOfTheSourceDocument(String sourceDocumentName) {
        homePage.getCaseCandidates().selectSourceDocumentFromTheListByName(sourceDocumentName);
    }
}
