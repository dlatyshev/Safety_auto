package io.customertimes.automation.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CasePage extends Base {

    public CasePage() {
        this.pageTitle = By.cssSelector("a[title = \"Details\"]");
    }

    public CaseNavigationSection selectCaseNavigationSection() {
        return new CaseNavigationSection();
    }

    public HeaderBunner selectHeaderBunner() {
        return new HeaderBunner();
    }

    public MilestonesSection selectMilestonesSection() {
        return new MilestonesSection();
    }

    public PossibleDuplicates selectPossibleDuplicatesSection() {
        return new PossibleDuplicates();
    }

    public SourceDocumentsSection selectSourceDocumentSection() {
        return new SourceDocumentsSection();
    }

    public static class SourceDocumentsSection extends CasePage {

        public SourceDocumentsSection() {
            this.pageTitle = By.xpath("//span[@title='Source Document']");
        }
    }

    public static class CaseNavigationSection extends CasePage {

        public CaseNavigationSection() {
            this.pageTitle = By.xpath("//h4[contains(text(), 'Case Navigation')]");
        }
    }

    public static class MilestonesSection extends CasePage {

        public MilestonesSection() {
            this.pageTitle = By.xpath("//span[text()=\"Milestones\"]");
        }
    }

    public static class HeaderBunner extends CasePage {

        public HeaderBunner() {
            this.pageTitle = By.cssSelector("div.slds-page-header.slds-page-header_record-home.forceHighlightsStencilDesktop.forceRecordLayout");
        }
    }

    public static class PossibleDuplicates extends CasePage {

        private SelenideElement manualSearchButton = $(By.xpath("//button[contains(text(),'Manual Search')]"));
        private SelenideElement findDuplicatesButton = $("button[name = \"searchForm\"]");
        private SelenideElement possibleDuplicatesSearchHeader = $(By.xpath("//h1[text() = \"Possible Duplicates\"]"));
        private SelenideElement closePossibleDuplicatesButton = $("button[title=\"Close\"]");
        private SelenideElement selectForMergeButton = $("button[title=\"Select For Merge\"]");

        public PossibleDuplicates() {
            this.pageTitle = By.xpath("//span[contains(text(),'Possible Duplicates')]");
        }

        public PossibleDuplicates clickManualSearchButton() {
            manualSearchButton.click();
            return this;
        }

        public PossibleDuplicates clickFindDuplicatesButton() {
            findDuplicatesButton.click();
            return this;
        }

        public void clickSelectForMergeButton() {
            selectForMergeButton.click();
        }

        public boolean duplicateSearchResultsAreOpened() {
            if (possibleDuplicatesSearchHeader.waitUntil(Condition.visible, 10000).isDisplayed()) {
                closePossibleDuplicatesButton.click();
                return true;
            } else {
                return false;
            }
        }
    }
}
