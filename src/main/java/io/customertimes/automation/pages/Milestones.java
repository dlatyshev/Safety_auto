package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Milestones extends Base {

    private SelenideElement milestonesTitle = $(By.xpath("//span[text()=\"Milestones\"]"));

    public Milestones() {
        this.isOpened = (pageIsOpened(milestonesTitle));
    }
}
