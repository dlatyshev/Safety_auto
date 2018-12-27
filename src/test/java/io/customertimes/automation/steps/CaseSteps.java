package io.customertimes.automation.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import io.customertimes.automation.pages.Case;
import io.customertimes.automation.utilities.TestUtils;
import org.testng.Assert;

public class CaseSteps extends TestUtils {
    Case aCase = new Case();

    @Then("^case details are opened$")
    public void caseDetailsAreOpened()  {
        Assert.assertTrue(aCase.pageIsOpened());
    }

    @Then("^user can edit case information manually$")
    public void userCanEditCaseInformationManually()  {
        // stub
    }
}
