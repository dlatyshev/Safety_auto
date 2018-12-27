package io.customertimes.automation.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Case extends Page{
    private By caseDetails = By.cssSelector("a[title = \"Details\"]");

    @Override
    public boolean pageIsOpened() {
       return $(caseDetails).waitUntil(Condition.exist, 10000).exists();
    }


}
