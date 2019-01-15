package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Dashboard extends Base {

    private SelenideElement dashboardTitle = $("div.dashboardTopLevelContainer.desktopDashboardsDashboard");

    public Dashboard() {
        this.isOpened = (pageIsOpened(dashboardTitle));
    }
}
