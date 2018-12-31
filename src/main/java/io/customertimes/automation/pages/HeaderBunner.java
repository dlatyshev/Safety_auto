package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HeaderBunner extends Base {

    private SelenideElement headerBunnerTitle =
            $("div.slds-page-header.slds-page-header_record-home.forceHighlightsStencilDesktop.forceRecordLayout");

    public HeaderBunner() {
        this.isPageOpened = (pageIsOpened(headerBunnerTitle));
    }

    public boolean isOpened() {
        return isPageOpened;
    }
}
