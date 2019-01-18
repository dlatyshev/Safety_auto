package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AppLauncherPage extends Base {

    private SelenideElement searchField = $("div[title=\"Search\"]");

    public AppLauncherPage() {
        this.pageTitle = By.cssSelector("h2[class='slds-text-heading--medium']");
    }

    public void clickOnItemOrApplication(String appNameOrItem) {
        $("a[title = \"" + appNameOrItem + "\"] > span > span").click();
    }
}
