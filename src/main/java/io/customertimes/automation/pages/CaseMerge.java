package io.customertimes.automation.pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.xpath;

public class CaseMerge extends Base {

    private SelenideElement acceptAsNewCasereportButton = $(xpath("//button[contains(text(),'Accept as New Case Report')]"));
    private SelenideElement acceptAsFollowsCaseReport = $(xpath("//button[contains(text(),'Accept as Follow-Up Case')]"));
    private SelenideElement previewCaseInformationButton = $("button[name='preview']");
    private SelenideElement subjectField = $(xpath("//form//div[text() = \"Subject\"]"));
    private SelenideElement caseTypeField = $(xpath("//form//div[text() = \"Case Type\"]"));
    private SelenideElement countryOfIncidenceField = $(xpath("//form//div[text() = \"Country of Incidence\"]"));
    private SelenideElement patientDateOfBirthField = $(xpath("//form//div[text() = \"Patient Date of Birth\"]"));
    private SelenideElement descriptionField = $(xpath("//form//div[text() = \"Description\"]"));
    private ElementsCollection checkboxes = $$("form button[role = \"button\"]");


    public CaseMerge() {
        this.pageTitle = By.xpath("//h1[text() = \"Case Merge\"]");
    }

    public boolean allRequiredButtonsAreDisplayed() {
        return acceptAsFollowsCaseReport.waitUntil(Condition.appears, 10000).isDisplayed()
                && acceptAsNewCasereportButton.waitUntil(Condition.appears, 10000).isDisplayed()
                && previewCaseInformationButton.waitUntil(Condition.appears, 10000).isDisplayed();
    }

    public boolean allRequiredFieldAreDisplayed() {
        return subjectField.waitUntil(Condition.appears, 10000).isDisplayed()
                && caseTypeField.waitUntil(Condition.appears, 10000).isDisplayed()
                && countryOfIncidenceField.waitUntil(Condition.appears, 10000).isDisplayed()
                && patientDateOfBirthField.waitUntil(Condition.appears, 10000).isDisplayed()
                && descriptionField.waitUntil(Condition.appears, 10000).isDisplayed();
    }

    public boolean allRequiredCheckboxesAreDisplayed() {
        return checkboxes.size() > 0;
    }

}
