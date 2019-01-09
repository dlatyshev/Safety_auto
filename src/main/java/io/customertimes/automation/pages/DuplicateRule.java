package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DuplicateRule extends DuplicateRulesPage {

    private SelenideElement duplicateRuleHeader = $("//span[text() = \"Duplicate Rule\"]");

    public DuplicateRule() {
        isOpened = pageIsOpened(duplicateRuleHeader);
    }
}
