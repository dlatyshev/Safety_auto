package io.customertimes.automation.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.xpath;

public class CaseCandidates extends Base {

    private ElementsCollection caseCandidatesList = $$(xpath("//th[@data-label=\"Account Name\"]//a"));

    public CaseCandidates() {
       this.pageTitle = By.cssSelector(".slds-card.slds-p-around--medium.cCaseCandidatesList");
    }

    public void selectSourceDocumentFromTheListByName(String name) {
        for(SelenideElement element : caseCandidatesList) {
            if (element.getText().contains(name)) {
                executeJavaScript("arguments[0].click()", element);
            }
        }
    }
}
