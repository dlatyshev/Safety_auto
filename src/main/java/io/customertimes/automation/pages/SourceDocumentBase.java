package io.customertimes.automation.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SourceDocumentBase extends Base {
    private SelenideElement readyForAutomaticCaseProcessingBtn = $x("//button[text() = \"Ready for Automatic Case Processing\"]");
    private SelenideElement enterCaseInformationManuallyBtn = $x("//button[text() = \"Enter Case Information Manually\"]");
    private SelenideElement splitBtn = $("button[name = \"split\"]");
    private SelenideElement mergeBtn = $("button[name = \"merge\"]");


    public SourceDocumentBase() {
        this.isOpened = pageIsOpened(splitBtn, mergeBtn, readyForAutomaticCaseProcessingBtn, enterCaseInformationManuallyBtn);
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

    public boolean isOpened() {
        return isOpened;
    }
}
