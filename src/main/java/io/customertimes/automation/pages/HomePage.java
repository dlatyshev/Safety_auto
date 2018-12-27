package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$$;

public class HomePage {
    private By listOfSourceDocuments = By.cssSelector("th[data-label=\"Account Name\"] a");


    public void selectSourceDocumentFromTheList(int index){
        $$(listOfSourceDocuments).get(index).click();
    }
}
