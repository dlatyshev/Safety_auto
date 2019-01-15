package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RecentRecords extends Base {

    private SelenideElement recentRecordsTitle = $("span[title='Recent Records");

    public RecentRecords() {
        this.isOpened = (pageIsOpened(recentRecordsTitle));
    }

    // temporary solution, change after moving to dev org.
    public CasePage clickOnCase() {
        $(By.xpath("//a[text()=0001220]")).click();
        return new CasePage();
    }
}
