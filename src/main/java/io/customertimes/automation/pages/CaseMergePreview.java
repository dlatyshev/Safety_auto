package io.customertimes.automation.pages;

import org.openqa.selenium.By;

import java.util.HashMap;

import static com.codeborne.selenide.Selenide.$;

public class CaseMergePreview extends CaseMerge {

    private By closePreviewButton = By.cssSelector("button[name=\"closePreview\"]");
    private By subjectField = By.cssSelector("input[name=\"Subject\"]");
    private By caseTypeField = By.cssSelector("input[name=\"Type\"]");
    private By countryOfIncidence = By.cssSelector("input[name=\"Country__c\"]");
    private By descriptionField = By.cssSelector("textarea[name=\"Description\"]");
    private By patientDateOfBirth = By.cssSelector("input[name=\"Patient_Date_of_Birth__c\"]");

    public CaseMergePreview() {
        this.pageTitle = By.xpath("//h1[text() = \"Preview\"]");
    }


    @Override
    public HashMap<String, Boolean> allRequiredButtonsAreDisplayed() {
        HashMap<String, Boolean> buttons = new HashMap<>();
        buttons.put("closePreviewButton", isElementDisplayed(closePreviewButton));

        return buttons;
    }

    @Override
    public HashMap<String, Boolean> allRequiredFieldsAreDisplayed() {
        HashMap<String, Boolean> fields = new HashMap<>();
        fields.put("subjectField", isElementDisplayed(subjectField));
        fields.put("caseTypeField", isElementDisplayed(caseTypeField));
        fields.put("countryOfIncidence", isElementDisplayed(countryOfIncidence));
        fields.put("descriptionField", isElementDisplayed(descriptionField));
        fields.put("patientDateOfBirth", isElementDisplayed(patientDateOfBirth));

        return fields;
    }


    public void clickClosePreviewButton() {
        $(closePreviewButton).click();
    }

    public boolean isClosePreviewButtonDisplayed() {
       return isElementDisplayed(closePreviewButton);
    }

}
