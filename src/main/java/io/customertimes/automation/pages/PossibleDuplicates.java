package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PossibleDuplicates extends Base {

    // TODO: rewrite selector
    private SelenideElement milestonesTitle = $(By.xpath("//span[text()=\"Possible Duplicates(0)\"]"));

    public PossibleDuplicates() {
        this.isPageOpened = (pageIsOpened(milestonesTitle));
    }

    public boolean isOpened() {
        return isPageOpened;
    }
}
