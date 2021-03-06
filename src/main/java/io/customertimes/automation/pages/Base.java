package io.customertimes.automation.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public abstract class Base {

    protected By pageTitle;

    public boolean isOpened() {
        return $(pageTitle).waitUntil(Condition.appears, 10000).isDisplayed();
    }

    public void reloadPage() {
        Selenide.refresh();
    }

    protected boolean isElementDisplayed(By element) {
        try {
            return $(element).waitUntil(Condition.exist, 10000).isDisplayed();

        } catch (ElementNotFound ex) {
            return false;
        }
    }

    protected boolean isElementDisplayed(SelenideElement element) {
        return $(element).waitUntil(Condition.exist, 10000).isDisplayed();
    }
}
