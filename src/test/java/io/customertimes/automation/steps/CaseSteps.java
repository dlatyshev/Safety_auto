package io.customertimes.automation.steps;

import cucumber.api.java.en.Then;
import io.customertimes.automation.pages.CasePage;
import io.customertimes.automation.utilities.TestUtils;
import org.testng.Assert;

public class CaseSteps extends TestUtils {

    private CasePage casePage = new CasePage();

    @Then("^case details are opened$")
    public void caseDetailsAreOpened()  {
        Assert.assertTrue(casePage.isOpened());
    }

    @Then("^user can edit case information manually$")
    public void userCanEditCaseInformationManually()  {
        // stub
    }
}
