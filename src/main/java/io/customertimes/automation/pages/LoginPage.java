package io.customertimes.automation.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends Page {

    public static final String URL = "https://test.salesforce.com";

    private SelenideElement usernameField = $("#username");
    private SelenideElement passwordField = $("#password");
    private SelenideElement loginButton = $("#Login");



    public OrgPage LogIn(String email, String password){

        usernameField.val(email);
        passwordField.val(password);
        loginButton.click();

        return new OrgPage();
    }

    @Override
    public boolean pageIsOpened() {
        return $(loginButton).waitUntil(Condition.visible, 10000).isDisplayed();
    }
}
