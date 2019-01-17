package io.customertimes.automation.steps;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.ex.ElementNotFound;
import cucumber.api.java.en.Given;
import io.customertimes.automation.pages.OrgPage;
import io.customertimes.automation.utilities.TestUtils;

public class OrgPageSteps extends TestUtils {

    private OrgPage orgPage = new OrgPage();

    @Given("^user clicks 'App launcher'$")
    public void userClicksAppLauncher() {
        try {
            orgPage.clickAppLauncher();
        } catch (ElementNotFound ex) {
            WebDriverRunner.getWebDriver().navigate().refresh();
            orgPage.clickAppLauncher();
        }
    }
}
