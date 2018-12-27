package io.customertimes.automation.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Case extends Page{
    private SelenideElement caseDetails = $("a[title = \"Details\"]");

    @Override
    public boolean pageIsOpened() {
       return caseDetails.waitUntil(Condition.exist, 10000).exists();
    }


}
