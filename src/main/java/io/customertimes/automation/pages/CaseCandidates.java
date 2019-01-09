package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CaseCandidates extends Base{

    private SelenideElement caseCandidatsList = $(".slds-card.slds-p-around--medium.cCaseCandidatesList");

    public CaseCandidates() {
        this.isOpened = (pageIsOpened(caseCandidatsList));
    }

}
