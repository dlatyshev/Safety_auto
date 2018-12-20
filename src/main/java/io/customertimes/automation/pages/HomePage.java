package io.customertimes.automation.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage{
    By homeTab = By.xpath("//span[text() = 'Home']");

    @Override
    public boolean pageIsOpened() {
       return  $(homeTab).waitUntil(Condition.appear, 40000).isDisplayed();
    }
}
