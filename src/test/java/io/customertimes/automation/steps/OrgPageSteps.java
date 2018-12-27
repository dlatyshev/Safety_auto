package io.customertimes.automation.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import io.customertimes.automation.pages.OrgPage;
import io.customertimes.automation.utilities.TestUtils;

public class OrgPageSteps extends TestUtils {
    OrgPage orgPage = new OrgPage();

    @Given("^user clicks 'App launcher'$")
    public void userClicksAppLauncher()  {
        orgPage.clickAppLauncher();
    }
}
