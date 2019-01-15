package io.customertimes.automation.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

public class SourceDocumentPage extends Base {

    private SelenideElement sourceDocumentTitle = $(By.xpath("//nav[@class = \"entityNameTitle\"]//span[text() = \"Source Document\"]"));
    private SelenideElement documentPreview = $("#mod-file-embed-widget-1");
    private SelenideElement sourceDocumentPreviewFrame = $("iframe[class=\"boxAttachment cBoxAttachmentViewer\"]");
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

    public boolean filePreviewIsOpened() {
        $(sourceDocumentPreviewFrame).waitUntil(Condition.visible, 10000);
        switchTo().frame(sourceDocumentPreviewFrame);
        return documentPreview.isDisplayed();
    }
}
