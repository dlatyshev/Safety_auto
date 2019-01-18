package io.customertimes.automation.steps;

import com.codeborne.selenide.ex.ElementNotFound;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.customertimes.automation.pages.AppLauncherPage;
import io.customertimes.automation.pages.OrgPage;
import io.customertimes.automation.utilities.TestUtils;
import org.testng.Assert;

public class AppLauncherSteps extends TestUtils {

    private OrgPage orgPage = new OrgPage();
    private AppLauncherPage appLauncher = new AppLauncherPage();

    @When("^user clicks on \"([^\"]*)\" in App Launcher$")
    public void userClicksOn(String appOrItem) {
        appLauncher.clickOnItemOrApplication(appOrItem);
    }

    @Then("^'App launcher' is opened$")
    public void appLauncherIsOpened() {
        boolean appLauncherIsOpened;
        try {
           appLauncherIsOpened =  appLauncher.isOpened();
        } catch (ElementNotFound ex) {
            orgPage.reloadPage();
            orgPage.clickAppLauncher();
            appLauncherIsOpened = appLauncher.isOpened();
        }
        Assert.assertTrue(appLauncherIsOpened);
    }
}
