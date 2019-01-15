package io.customertimes.automation.pages;

public class HomePage extends Base {

    public HomePage() {
        this.isOpened = pageIsOpened();
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

    public Chatter getChatter() {
        return new Chatter();
    }
}
