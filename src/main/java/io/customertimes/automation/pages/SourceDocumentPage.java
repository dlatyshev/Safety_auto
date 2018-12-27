package io.customertimes.automation.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SourceDocumentPage extends Page {
    private SelenideElement readyForAutomaticCaseProcessingBtn = $x("//button[text() = \"Ready for Automatic Case Processing\"]");
    private SelenideElement enterCaseInformationManuallyBtn = $x("//button[text() = \"Enter Case Information Manually\"]");
    private SelenideElement splitBtn = $("button[name = \"split\"]");
    private SelenideElement mergeBtn = $("button[name = \"merge\"]");

    @Override
    public boolean pageIsOpened() {
        boolean splitButtonExists = splitBtn.waitUntil(Condition.appears, 10000).exists();
        boolean mergeButtonExists = mergeBtn.waitUntil(Condition.appears, 10000).exists();
        return splitButtonExists && mergeButtonExists;
    }

    public void clickTheButton(String buttonName){
       switch(buttonName.toLowerCase()){
           case "ready for automatic case processing":
               readyForAutomaticCaseProcessingBtn.click();
               break;
           case "enter case information manually":
               enterCaseInformationManuallyBtn.click();
               break;
           case "split":
               splitBtn.click();
               break;
           case "merge":
               mergeBtn.click();
               break;
       }
    }

}
