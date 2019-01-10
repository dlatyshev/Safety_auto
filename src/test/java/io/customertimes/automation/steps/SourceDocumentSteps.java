package io.customertimes.automation.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.customertimes.automation.pages.SourceDocumentPage;
import org.testng.Assert;

public class SourceDocumentSteps {

    private SourceDocumentPage sourceDocument;

    @Then("^details and file preview are opened$")
    public void detailsAndFilePreviewAreOpened() {
        if (sourceDocument == null) {
            sourceDocument = new SourceDocumentPage();

        }
        Assert.assertTrue(sourceDocument.isOpened());
        Assert.assertTrue(sourceDocument.filePreviewIsOpened());
    }

    @When("^user clicks on the button \"([^\"]*)\"$")
    public void userClicksOnTheButton(String buttonName) {
        if (sourceDocument == null) {
            sourceDocument = new SourceDocumentPage();
        }
        sourceDocument.clickTheButton(buttonName);
    }
}
