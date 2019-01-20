package io.customertimes.automation.pages;


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
    private ElementsCollection checkboxes = $$(xpath("form button[role = \"button\"]"));


    public CaseMerge() {
        this.pageTitle = By.xpath("//h1[text() = \"Case Merge\"]");
    }




}
