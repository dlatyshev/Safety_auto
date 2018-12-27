package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$$;

public class HomePage {
    CaseCandidates caseCandidates;

    private By listOfSourceDocuments = By.cssSelector("th[data-label=\"Account Name\"] a");


    public void selectSourceDocumentFromTheList(int index){
        $$(listOfSourceDocuments).get(index).click();
    }

}
