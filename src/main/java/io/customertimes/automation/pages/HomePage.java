package io.customertimes.automation.pages;


import org.openqa.selenium.By;

public class HomePage extends Base {

    public HomePage() {
        this.pageTitle = By.cssSelector("a[title='Home']");
    }

    public CaseCandidates getCaseCandidates() {
        return new CaseCandidates();
    }

    public Dashboard getDashboard() {
        return new Dashboard();
    }

    public RecentRecords getRecentRecords() {
        return new RecentRecords();

    }

    public Dashboard selectDashboard() {
        return new Dashboard();
    }

    public CaseCandidates selectCaseCandidates() {
        return new CaseCandidates();
    }

    public Chatter selectChatter() {
        return new Chatter();
    }

    public RecentRecords selectRecentRecords() {
        return new RecentRecords();
    }
}
