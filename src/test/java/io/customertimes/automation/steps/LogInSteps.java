package io.customertimes.automation.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import io.customertimes.automation.pages.AppLauncherPage;
import io.customertimes.automation.pages.HomePage;
import io.customertimes.automation.pages.LoginPage;
import io.customertimes.automation.utilities.TestUtils;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.*;


public class LogInSteps extends TestUtils {
    private LoginPage loginPage = new LoginPage();
    private HomePage homePage;
    private AppLauncherPage appLauncherPage;

    @Given("^open login page$")
    public void openLoginPage() throws Throwable {
        open(LoginPage.URL);
    }


    @Then("^main page is opened$")
    public void mainPageIsOpened() throws Throwable {
        Assert.assertTrue(homePage.pageIsOpened());
    }


    @Given("^enter valid credentials and press 'Enter'$")
    public void enterValidCredentialsAndPressEnter() throws Throwable {
        String username = readProperty("username");
        String password = readProperty("password");
        homePage = loginPage.LogIn(username, password);
    }


    @Then("^dashboard is opened$")
    public void dashboardIsOpened() throws Throwable {

    }

    @When("^user click 'App launcher' and select \"([^\"]*)\"$")
    public void userClickAppLauncherAndSelect(String appName) throws Throwable {
        appLauncherPage = homePage.clickAppLauncher();
        appLauncherPage.selectApp(appName);
    }
}