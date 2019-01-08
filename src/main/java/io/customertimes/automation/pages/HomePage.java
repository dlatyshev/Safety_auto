package io.customertimes.automation.pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class HomePage extends Base {

    private CaseCandidates caseCandidates;

    private ElementsCollection listOfSourceDocuments = $$("th[data-label=\"Account Name\"] a");

    public HomePage() {
        this.isPageOpened = pageIsOpened();
    }

    public void selectSourceDocumentFromTheList(int index) {
        listOfSourceDocuments.get(index).click();
    }

    public boolean isOpened() {
        return isPageOpened;
    }

    public Dashboard selectDashboard() {
        return new Dashboard();
    }

    public CaseCandidates selectCaseCandidates() {
        return new CaseCandidates();
    }

    public Chatter selectChater() {
        return new Chatter();
    }

    public RecentRecords selectRecentRecords() {
        return new RecentRecords();
    }
}
