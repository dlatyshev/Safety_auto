package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CasePage extends Base {

    private SelenideElement caseDetails = $("a[title = \"Details\"]");

    public CasePage() {
        this.isOpened = (pageIsOpened(caseDetails));
    }

    public CaseNavigation selectCaseNavigation() {
        return new CaseNavigation();
    }

    public HeaderBunner selectHeaderBunner() {
        return new HeaderBunner();
    }

    public Milestones selectMilestones() {
        return new Milestones();
    }

    public PossibleDuplicates selectPossibleDuplicates() {
        return new PossibleDuplicates();
    }

    public SourceDocumentPage selectSourceDocumentPage() {
        return new SourceDocumentPage();
    }
}
