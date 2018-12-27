package io.customertimes.automation.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.customertimes.automation.pages.SourceDocumentBase;
import org.testng.Assert;

public class SourceDocumentSteps {
    SourceDocumentBase sourceDocument = new SourceDocumentBase();

    @Then("^details and file preview are opened$")
    public void detailsAndFilePreviewAreOpened() {
        Assert.assertTrue(sourceDocument.isOpened());
    }

    @When("^user clicks on the button \"([^\"]*)\"$")
    public void userClicksOnTheButton(String buttonName) {
        sourceDocument.clickTheButton(buttonName);
    }
}
