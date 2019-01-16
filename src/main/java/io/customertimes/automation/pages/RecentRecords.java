package io.customertimes.automation.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RecentRecords extends Base {

    public RecentRecords() {
       this.pageTitle = By.cssSelector("span[title='Recent Records");
    }

    public CasePage clickOnRecentRecord(String record) {
        $(By.xpath("//li[@class = \"recentsRecordCardRow\"]//a[contains(text()," + record + ")]")).click();
        return new CasePage();
    }
}
