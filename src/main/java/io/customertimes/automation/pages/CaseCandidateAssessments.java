package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CaseCandidateAssessments extends Base {

    private SelenideElement caseCandidateAssessmentsList = $("span[title=\"Case Candidate Assessments\"]");

    public CaseCandidateAssessments() {
        this.isOpened = (pageIsOpened(caseCandidateAssessmentsList));
    }

}
