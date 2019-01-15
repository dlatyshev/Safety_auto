package io.customertimes.automation.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PossibleDuplicates extends Base {

    private SelenideElement possibleDuplicatesHeader = $(By.xpath("//span[contains(text(),'Possible Duplicates')]"));
    private SelenideElement manualSearchButton = $(By.xpath("//button[contains(text(),'Manual Search')]"));
    private SelenideElement findDuplicatesButton = $("button[name = \"searchForm\"]");
    private SelenideElement possibleDuplicatesSearchHeader = $(By.xpath("//h1[text() = \"Possible Duplicates\"]"));

    public PossibleDuplicates() {
        this.isOpened = (pageIsOpened(possibleDuplicatesHeader));
    }

    public PossibleDuplicates clickManualSearchButton() {
        manualSearchButton.click();
        return this;
    }

    public PossibleDuplicates clickFindDuplicatesButton() {
        findDuplicatesButton.click();
        return this;
    }

    public boolean duplicateSearchResultsAreOpened() {
        return possibleDuplicatesSearchHeader.waitUntil(Condition.visible, 10000).isDisplayed();
    }
}
