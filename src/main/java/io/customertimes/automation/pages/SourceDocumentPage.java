package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SourceDocumentPage extends Base {

    // TODO: create selector
    private SelenideElement sourceDocumentTitle = $("");

    private SelenideElement readyForAutomaticCaseProcessingBtn = $x("//button[text() = \"Ready for Automatic CasePage Processing\"]");
    private SelenideElement enterCaseInformationManuallyBtn = $x("//button[text() = \"Enter CasePage Information Manually\"]");
    private SelenideElement splitBtn = $("button[name = \"split\"]");
    private SelenideElement mergeBtn = $("button[name = \"merge\"]");

    public SourceDocumentPage() {
        this.isPageOpened = pageIsOpened(sourceDocumentTitle);
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

    public boolean isOpened() {
        // TODO: uncomment after element appeared
        return true;
    }
}
