package io.customertimes.automation.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage extends BasePage {
    public static final String URL = "https://iqvia-safety--dev1.cs107.my.salesforce.com";
    private By usernameField = By.cssSelector("#username");
    private By passwordField = By.cssSelector("#password");
    private By loginButton = By.cssSelector("#Login");



    public HomePage LogIn(String email, String password){
        $(usernameField).val(email);
        $(passwordField).val(password);
        $(loginButton).click();

        return new HomePage();
    }

    @Override
    public boolean pageIsOpened() {
        return $(loginButton).waitUntil(Condition.visible, 10000).isDisplayed();
    }
}
