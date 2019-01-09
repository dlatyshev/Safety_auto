package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class DuplicateRule extends DuplicateRulesPage {

    private SelenideElement duplicateRuleHeader = $(xpath("//span[text() = \"Duplicate Rule\"]"));

    public DuplicateRule() {
        isOpened = pageIsOpened(duplicateRuleHeader);
    }
}
