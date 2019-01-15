package io.customertimes.automation.pages;

import org.openqa.selenium.By;

public class Dashboard extends Base {

    public Dashboard() {
        this.pageTitle = By.cssSelector("div.dashboardTopLevelContainer.desktopDashboardsDashboard");
    }
}
