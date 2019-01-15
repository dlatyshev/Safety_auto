package io.customertimes.automation.steps;

import cucumber.api.java.en.Given;
import io.customertimes.automation.pages.OrgPage;
import io.customertimes.automation.pages.LoginPage;
import io.customertimes.automation.utilities.TestUtils;

import static com.codeborne.selenide.Selenide.*;

public class LogInSteps extends TestUtils {

    private LoginPage loginPage;

    @Given("^Log in to SF$")
    public OrgPage logInToSF() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        open(LoginPage.URL);
        String username = readProperty("username");
        String password = readProperty("password");
        loginPage.LogIn(username, password);
        return new OrgPage();
    }
}