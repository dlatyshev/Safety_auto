package io.customertimes.automation.pages;

import org.openqa.selenium.By;

public class Milestones extends Base {

    public Milestones() {
        this.pageTitle = By.xpath("//span[text()=\"Milestones\"]");
    }
}
