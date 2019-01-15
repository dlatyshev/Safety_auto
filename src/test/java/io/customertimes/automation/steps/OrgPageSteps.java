package io.customertimes.automation.steps;

import cucumber.api.java.en.Given;
import io.customertimes.automation.pages.OrgPage;
import io.customertimes.automation.utilities.TestUtils;

public class OrgPageSteps extends TestUtils {

    private OrgPage orgPage;

    @Given("^user clicks 'App launcher'$")
    public void userClicksAppLauncher() {
        if (orgPage == null) {
            orgPage = new OrgPage();
        }
        orgPage.clickAppLauncher();
    }
}
