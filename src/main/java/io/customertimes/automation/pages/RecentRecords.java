package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RecentRecords extends Base {

    private SelenideElement recentRecordsTitle = $("span[title='Recent Records");

    public RecentRecords() {
        this.isPageOpened = (pageIsOpened(recentRecordsTitle));
    }

    public boolean isOpened() {
        return isPageOpened;
    }
}
