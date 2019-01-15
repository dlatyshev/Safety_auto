package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CaseNavigation extends Base {

    private SelenideElement caseNavigationTitle = $("h4#treeheading");

    public CaseNavigation() {
        this.isOpened = (pageIsOpened(caseNavigationTitle));
    }
}
