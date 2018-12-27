package io.customertimes.automation.steps;

import cucumber.api.java.en.When;
import io.customertimes.automation.pages.AppLauncherPage;
import io.customertimes.automation.utilities.TestUtils;

public class AppLauncherSteps extends TestUtils {
    private AppLauncherPage appLauncher = new AppLauncherPage();

    @When("^user clicks on \"([^\"]*)\"$")
    public void userClicksOn(String appOrItem) {
        appLauncher.clickOnItemOrApplication(appOrItem);
    }
}
