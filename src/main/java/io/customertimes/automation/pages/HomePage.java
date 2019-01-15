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
