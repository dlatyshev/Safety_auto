package io.customertimes.automation.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.customertimes.automation.pages.SourceDocumentPage;
import org.testng.asserts.SoftAssert;

public class SourceDocumentSteps {

    private SourceDocumentPage sourceDocument = new SourceDocumentPage();
    private SoftAssert softAssert = new SoftAssert();

    @Then("^details and file preview are opened$")
    public void detailsAndFilePreviewAreOpened() {
        softAssert.assertTrue(sourceDocument.isOpened());
        softAssert.assertTrue(sourceDocument.filePreviewIsOpened());
    }

    @When("^user clicks on the button \"([^\"]*)\"$")
    public void userClicksOnTheButton(String buttonName) {
        sourceDocument.clickTheButton(buttonName);
    }
}
