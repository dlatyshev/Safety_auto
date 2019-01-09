package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SourceDocumentPage extends Base {

    private SelenideElement sourceDocumentTitle = $("span[title='Source Document']");

    private SelenideElement readyForAutomaticCaseProcessingBtn = $x("//button[text() = \"Ready for Automatic CasePage Processing\"]");
    private SelenideElement enterCaseInformationManuallyBtn = $x("//button[text() = \"Enter CasePage Information Manually\"]");
    private SelenideElement splitBtn = $("button[name = \"split\"]");
    private SelenideElement mergeBtn = $("button[name = \"merge\"]");

    public SourceDocumentPage() {
        this.isOpened = pageIsOpened(sourceDocumentTitle);
    }

    public void clickTheButton(String buttonName) {
        switch (buttonName.toLowerCase()) {
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
