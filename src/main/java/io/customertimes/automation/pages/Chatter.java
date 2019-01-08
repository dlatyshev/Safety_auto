package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Chatter extends Base {

    private SelenideElement chaterTitle = $("div.slds-card-wrapper.forceChatterFeedInner");

    public Chatter() {
        this.isPageOpened = (pageIsOpened(chaterTitle));
    }

    public boolean isOpened() {
        return isPageOpened;
    }
}
