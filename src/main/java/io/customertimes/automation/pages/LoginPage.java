package io.customertimes.automation.pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends Base {

    public static final String URL = "https://test.salesforce.com";
    private SelenideElement usernameField = $("#username");
    private SelenideElement passwordField = $("#password");

    public OrgPage LogIn(String email, String password) {
        usernameField.val(email);
        passwordField.val(password).pressEnter();
        return new OrgPage();
    }
}
