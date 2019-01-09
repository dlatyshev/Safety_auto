package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DuplicateRulesPage extends Base {

    private SelenideElement duplicateRulesListHeader = $("span[title = \"Duplicate Rule Name\"]");

    public DuplicateRulesPage() {
        this.isOpened = pageIsOpened(duplicateRulesListHeader);
    }

}
