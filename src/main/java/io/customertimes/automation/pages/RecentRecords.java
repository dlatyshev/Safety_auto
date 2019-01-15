package io.customertimes.automation.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RecentRecords extends Base {

    public RecentRecords() {
       this.pageTitle = By.cssSelector("span[title='Recent Records");
    }

    // temporary solution, change after moving to dev org.
    public CasePage clickOnCase() {
        $(By.xpath("//a[text()=0001220]")).click();
        return new CasePage();
    }
}
