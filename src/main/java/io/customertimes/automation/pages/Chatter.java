package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Chatter extends Base {

    private SelenideElement chatterTitle = $("div.slds-card-wrapper.forceChatterFeedInner");

    public Chatter() {
        this.isOpened = (pageIsOpened(chatterTitle));
    }
}
