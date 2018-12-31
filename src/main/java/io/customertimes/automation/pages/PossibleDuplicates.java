package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PossibleDuplicates extends Base {

    // TODO: create selector
    private SelenideElement milestonesTitle = $("");

    public PossibleDuplicates() {
        this.isPageOpened = (pageIsOpened(milestonesTitle));
    }

    public boolean isOpened() {
        return isPageOpened;
    }
}
