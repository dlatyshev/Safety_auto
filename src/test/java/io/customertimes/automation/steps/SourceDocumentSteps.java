package io.customertimes.automation.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.customertimes.automation.pages.SourceDocumentPage;
import org.testng.Assert;

public class SourceDocumentSteps {
    SourceDocumentPage sourceDocument = new SourceDocumentPage();

    @Then("^details and file preview are opened$")
    public void detailsAndFilePreviewAreOpened() {
        Assert.assertTrue(sourceDocument.pageIsOpened());
    }

    @When("^user clicks on the button \"([^\"]*)\"$")
    public void userClicksOnTheButton(String buttonName) {
        sourceDocument.clickTheButton(buttonName);
    }
}
