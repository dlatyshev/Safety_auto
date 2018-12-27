package io.customertimes.automation.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SourceDocumentPage extends Page {
    private By readyForAutomaticCaseProcessingBtn = By.xpath("//button[text() = \"Ready for Automatic Case Processing\"]");
    private By enterCaseInformationManuallyBtn = By.xpath("//button[text() = \"Enter Case Information Manually\"]");
    private By splitBtn = By.cssSelector("button[name = \"split\"]");
    private By mergeBtn = By.cssSelector("button[name = \"merge\"]");

    @Override
    public boolean pageIsOpened() {
        boolean splitButtonExists = $(splitBtn).waitUntil(Condition.appears, 10000).exists();
        boolean mergeButtonExists = $(mergeBtn).waitUntil(Condition.appears, 10000).exists();
        return splitButtonExists && mergeButtonExists;
    }

    public void clickTheButton(String buttonName){
       switch(buttonName.toLowerCase()){
           case "ready for automatic case processing":
               $(readyForAutomaticCaseProcessingBtn).click();
               break;
           case "enter case information manually":
               $(enterCaseInformationManuallyBtn).click();
               break;
           case "split":
               $(splitBtn).click();
               break;
           case "merge":
               $(mergeBtn).click();
               break;
       }
    }

}
