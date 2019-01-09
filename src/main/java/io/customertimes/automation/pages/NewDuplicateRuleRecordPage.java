package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.eo.Se;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class NewDuplicateRuleRecordPage extends DuplicateRulesPage {

    private SelenideElement newDuplicateRuleHeader = $(xpath("//h2[text() = \"New Duplicate Rule\"]"));
    private SelenideElement duplicateRuleField = $(xpath("//span[text() = \"Duplicate Rule Name\"]/parent::label/following-sibling::input"));
    private SelenideElement caseReportTypeDropdown = $(xpath("//span[text() = \"Case Report Type\"]/parent::span/following-sibling::div//a"));
    private SelenideElement rowCountField = $(xpath("//span[text() = \"Row Count\"]/parent::label/following-sibling::input"));
    private SelenideElement rowOverflowField = $(xpath("//span[text() = \"Row Overflow\"]/parent::label/following-sibling::input"));
    private SelenideElement confidenceThreshold = $(xpath("//span[text() = \"Confidence Threshold\"]/parent::label/following-sibling::input"));
    private SelenideElement statusDropdown = $(xpath("//span[text() = \"Status\"]/parent::span/following-sibling::div//a"));
    private SelenideElement saveButton = $("button[title = \"Save\"]");
    private SelenideElement cancelButton = $("button[title = \"Cancel\"]");
    private SelenideElement saveAndNewButton = $("button[title=\"Save & New\"]");

    public NewDuplicateRuleRecordPage() {
      this.isOpened = pageIsOpened(newDuplicateRuleHeader);
    }

    public void populateAllFields() {
        duplicateRuleField.setValue("Testing");
        caseReportTypeDropdown.click();
        caseReportTypeDropdown.sendKeys(Keys.ARROW_DOWN);
        caseReportTypeDropdown.sendKeys(Keys.ARROW_DOWN);
        caseReportTypeDropdown.pressEnter();
        rowCountField.setValue("10");
        rowOverflowField.setValue("20");
        confidenceThreshold.setValue("30");
    }

    public DuplicateRule saveNewRule() {
        saveButton.click();
        return new DuplicateRule();
    }


}
