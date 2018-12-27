package io.customertimes.automation.steps;

import cucumber.api.java.en.Given;
import io.customertimes.automation.pages.OrgPage;
import io.customertimes.automation.pages.LoginBase;
import io.customertimes.automation.utilities.TestUtils;

import static com.codeborne.selenide.Selenide.*;


public class LogInSteps extends TestUtils {
    private LoginBase loginPage = new LoginBase();


    @Given("^Log in to SF$")
    public OrgPage logInToSF() {
        open(LoginBase.URL);
        String username = readProperty("username");
        String password = readProperty("password");
        loginPage.LogIn(username, password);
        return new OrgPage();
    }


}