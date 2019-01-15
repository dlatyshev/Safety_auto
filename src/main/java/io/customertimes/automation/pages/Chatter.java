package io.customertimes.automation.pages;

import org.openqa.selenium.By;

public class Chatter extends Base {

    public Chatter() {
        this.pageTitle = By.cssSelector("div.slds-card-wrapper.forceChatterFeedInner");
    }
}
