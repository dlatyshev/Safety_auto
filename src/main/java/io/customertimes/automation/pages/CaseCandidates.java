package io.customertimes.automation.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.xpath;

public class CaseCandidates extends Base {

    private SelenideElement caseCandidates =  $(".slds-card.slds-p-around--medium.cCaseCandidatesList");
    private ElementsCollection caseCandidatesList = $$(xpath("//th[@data-label=\"Account Name\"]//a"));


    public CaseCandidates() {
        this.isOpened = (pageIsOpened(caseCandidates));
    }

    public void selectSourceDocumentFromTheListByName(String name) {
        for(SelenideElement element : caseCandidatesList) {
            if (element.getText().contains(name)) {
                executeJavaScript("arguments[0].click()", element);
            }
        }
    }
}
