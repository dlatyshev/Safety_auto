package io.customertimes.automation.steps;

import cucumber.api.java.en.When;
import io.customertimes.automation.pages.AppLauncherBase;
import io.customertimes.automation.utilities.TestUtils;

public class AppLauncherSteps extends TestUtils {
    private AppLauncherBase appLauncher = new AppLauncherBase();

    @When("^user clicks on \"([^\"]*)\"$")
    public void userClicksOn(String appOrItem) {
        appLauncher.clickOnItemOrApplication(appOrItem);
    }
}
