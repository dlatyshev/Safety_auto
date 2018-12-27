package io.customertimes.automation.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {
    CaseCandidates caseCandidates;

    private ElementsCollection listOfSourceDocuments = $$("th[data-label=\"Account Name\"] a");


    public void selectSourceDocumentFromTheList(int index){
        listOfSourceDocuments.get(index).click();
    }

}
