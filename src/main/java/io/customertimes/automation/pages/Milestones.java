package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Milestones extends Base {

    private SelenideElement milestonesTitle = $("//span[text()=\"Milestones\"]");

    public Milestones() {
        this.isPageOpened = (pageIsOpened(milestonesTitle));
    }

    public boolean isOpened() {
        return isPageOpened;
    }
}
