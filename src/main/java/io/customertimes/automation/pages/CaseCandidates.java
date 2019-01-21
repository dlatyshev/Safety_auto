package io.customertimes.automation.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.customertimes.automation.utilities.TestUtils;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.xpath;

public class CaseCandidates extends Base {

    private ElementsCollection caseCandidatesList = $$(xpath("//th[@data-label=\"Account Name\"]//a"));
    private SelenideElement sourceDocumentNameInSourseDocumentHover =
            $(xpath("//div[@class='slds-col slds-has-flexi-truncate']//span[text()=\"Source Document Name\"]"));
    private SelenideElement receiptDateInSourseDocumentHover =
            $(xpath("//div[@class='slds-col slds-has-flexi-truncate']//span[text()=\"Receipt Date\"]"));
    private SelenideElement numberOfPagesInSourseDocumentHover =
            $(xpath("//div[@class='slds-col slds-has-flexi-truncate']//span[text()=\"Number of Pages\"]"));
    private SelenideElement numberOfDocumentsInSourseDocumentHover =
            $(xpath("//div[@class='slds-col slds-has-flexi-truncate']//span[text()=\"Number of Documents\"]"));

    public CaseCandidates() {
        this.pageTitle = By.cssSelector(".slds-card.slds-p-around--medium.cCaseCandidatesList");
    }

    public void selectSourceDocumentFromTheListByName(String name) {
        for (SelenideElement element : caseCandidatesList) {
            if (element.getText().contains(name)) {
                executeJavaScript("arguments[0].click()", element);
            }
        }
    }

    public void getSourseDocumentHover(String name) {
        for (SelenideElement element : caseCandidatesList) {
            if (element.getText().contains(name)) {
                executeJavaScript("arguments[0].scrollIntoView(true);", element);
                String code = "var fireOnThis = arguments[0];"
                        + "var evObj = document.createEvent('MouseEvents');"
                        + "evObj.initEvent( 'mouseover', true, true );"
                        + "fireOnThis.dispatchEvent(evObj);";
                executeJavaScript(code, element);
                new TestUtils().sleep(600);
            }
        }
    }
}
