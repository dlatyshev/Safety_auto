package io.customertimes.automation.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import io.customertimes.automation.pages.HomePage;
import io.customertimes.automation.pages.LoginPage;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.*;


public class LogInSteps {
    private LoginPage loginPage = new LoginPage();
    private HomePage homePage;

    @When("^user logs in with credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_logs_in_with_credentials_and(String email, String password) throws Throwable {
        open(LoginPage.URL);
        homePage = loginPage.LogIn(email, password);
    }

    @Then("^main page is opened$")
    public void main_page_is_opened() throws Throwable {
        Assert.assertTrue(homePage.pageIsOpened());
    }
}