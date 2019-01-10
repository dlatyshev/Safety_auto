package io.customertimes.automation.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CaseCandidates extends Base {

    private SelenideElement caseCandidates =  $(".slds-card.slds-p-around--medium.cCaseCandidatesList");
    private ElementsCollection caseCandidatesList = $$("th[data-label=\"Account Name\"] a");


    public CaseCandidates() {
        this.isOpened = (pageIsOpened(caseCandidates));
    }

    public void selectSourceDocumentFromTheList(int index) {
        caseCandidatesList.get(index).click();
    }

}

