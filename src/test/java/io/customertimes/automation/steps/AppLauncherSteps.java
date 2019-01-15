package io.customertimes.automation.steps;

import cucumber.api.java.en.When;
import io.customertimes.automation.pages.AppLauncherPage;
import io.customertimes.automation.utilities.TestUtils;

public class AppLauncherSteps extends TestUtils {

    private AppLauncherPage appLauncher;

    @When("^user clicks on \"([^\"]*)\" in App Launcher$")
    public void userClicksOn(String appOrItem) {
        if (appLauncher == null) {
            appLauncher = new AppLauncherPage();
        }
        appLauncher.clickOnItemOrApplication(appOrItem);
    }
}
