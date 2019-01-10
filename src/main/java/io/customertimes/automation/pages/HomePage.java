package io.customertimes.automation.pages;

public class HomePage extends Base {

    private CaseCandidates caseCandidates;
    private Dashboard dashboard;
    private RecentRecords recentRecords;
    private Chatter chatter;


    public HomePage() {
        this.isOpened = pageIsOpened();
        this.caseCandidates = new CaseCandidates();
        this.dashboard = new Dashboard();
        this.recentRecords = new RecentRecords();
        this.chatter = new Chatter();
    }

    public CaseCandidates getCaseCandidates() {
        return caseCandidates;
    }

    public Dashboard getDashboard() {
        return dashboard;
    }

    public RecentRecords getRecentRecords() {
        return recentRecords;
    }

    public Chatter getChatter() {
        return chatter;
    }
}
