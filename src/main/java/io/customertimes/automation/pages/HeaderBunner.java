package io.customertimes.automation.pages;

import org.openqa.selenium.By;

public class HeaderBunner extends Base {

    public HeaderBunner() {
        this.pageTitle = By.cssSelector("div.slds-page-header.slds-page-header_record-home.forceHighlightsStencilDesktop.forceRecordLayout");
    }
}
