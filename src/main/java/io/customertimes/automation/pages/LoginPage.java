package io.customertimes.automation.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends Page {

    public static final String URL = "https://test.salesforce.com";

    private By usernameField = By.cssSelector("#username");
    private By passwordField = By.cssSelector("#password");
    private By loginButton = By.cssSelector("#Login");



    public OrgPage LogIn(String email, String password){
        type(email, usernameField);
        type(password, passwordField);
        click(loginButton);

        return new OrgPage();
    }

    @Override
    public boolean pageIsOpened() {
        return $(loginButton).waitUntil(Condition.visible, 10000).isDisplayed();
    }
}
