package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PossibleDuplicates extends Base {

    private SelenideElement PossibleDuplicatesHeader = $(By.xpath("//span[contains(text(),'Possible Duplicates')]"));

    public PossibleDuplicates() {
        this.isOpened = (pageIsOpened(PossibleDuplicatesHeader));
    }

}
