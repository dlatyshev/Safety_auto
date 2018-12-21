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


    @Then("^main page is opened$")
    public void main_page_is_opened() throws Throwable {
        Assert.assertTrue(homePage.pageIsOpened());
    }

    @Given("^open login page$")
    public void openLoginPage() throws Throwable {
        open(LoginPage.URL);
    }

    @Given("^enter valid credentials and press enter$")
    public void enterValidCredentialsAndPressEnter() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}