package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Chater extends Base {

    private SelenideElement chaterTitle = $("div.slds-card-wrapper.forceChatterFeedInner");

    public Chater() {
        this.isPageOpened = (pageIsOpened(chaterTitle));
    }

    public boolean isOpened() {
        return isPageOpened;
    }
}
