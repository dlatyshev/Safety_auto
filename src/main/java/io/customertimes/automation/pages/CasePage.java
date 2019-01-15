package io.customertimes.automation.pages;

import org.openqa.selenium.By;

public class CasePage extends Base {

    private PossibleDuplicates possibleDuplicates;

    public CasePage() {
        this.pageTitle = By.cssSelector("a[title = \"Details\"]");
        this.possibleDuplicates = new PossibleDuplicates();
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
