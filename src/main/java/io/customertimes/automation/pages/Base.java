package io.customertimes.automation.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public abstract class Base {

   // protected boolean isOpened;
    protected By pageTitle;

    public boolean isOpened() {
       return  $(pageTitle).waitUntil(Condition.appears, 10000).isDisplayed();
    }

    public void reloadPage() {
        Selenide.refresh();
    }
}
