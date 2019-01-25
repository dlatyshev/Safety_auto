package io.customertimes.automation.pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import java.util.HashMap;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CaseMerge extends Base {

    private By acceptAsNewCaseReportButton = By.xpath("//button[contains(text(),'Accept as New Case Report')]");
    private By acceptAsFollowsCaseReportButton = By.xpath("//button[contains(text(),'Accept as Follow-Up Case')]");
    private By previewCaseInformationButton = By.cssSelector("button[name='preview']");
    private By subjectField = By.xpath("//form//div[text() = \"Subject\"]");
    private By caseTypeField = By.xpath("//form//div[text() = \"Case Type\"]");
    private By countryOfIncidenceField = By.xpath("//form//div[text() = \"Country of Incidence\"]");
    private By patientDateOfBirthField = By.xpath("//form//div[text() = \"Patient Date of Birth\"]");
    private By descriptionField = By.xpath("//form//div[text() = \"Description\"]");
    private ElementsCollection checkboxes = $$("form button[role = \"button\"]");

    public CaseMerge() {
        this.pageTitle = By.xpath("//h1[text() = \"Case Merge\"]");
    }

    public HashMap<String, Boolean> allRequiredButtonsAreDisplayed() {
        HashMap<String, Boolean> buttons = new HashMap<>();
        buttons.put("acceptAsFollowsCaseReportButton", isElementDisplayed(acceptAsFollowsCaseReportButton));
        buttons.put("acceptAsNewCaseReportButton", isElementDisplayed(acceptAsNewCaseReportButton));
        buttons.put("previewCaseInformationButton", isElementDisplayed(previewCaseInformationButton));

        return buttons;
    }

    public HashMap<String, Boolean> allRequiredFieldsAreDisplayed() {
        HashMap<String, Boolean> fields = new HashMap<>();
        fields.put("subjectField", isElementDisplayed(subjectField));
        fields.put("caseTypeField", isElementDisplayed(caseTypeField));
        fields.put("countryOfIncidenceField", isElementDisplayed(countryOfIncidenceField));
        fields.put("patientDateIfBirthField", isElementDisplayed(patientDateOfBirthField));
        fields.put("descriptionField", isElementDisplayed(descriptionField));

        return fields;
    }

    public boolean allRequiredCheckboxesAreDisplayed() {
        return checkboxes.size() > 0;
    }

    public CaseMergePreview clickPreviewCaseInformationButton() {
        $(previewCaseInformationButton).click();
        return new CaseMergePreview();
    }
}
