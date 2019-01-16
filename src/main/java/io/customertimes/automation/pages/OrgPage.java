package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OrgPage extends Base {

    private SelenideElement appLauncher = $("nav > button");

    public OrgPage() {
        this.pageTitle = By.xpath("//span[text() = 'Home']");
    }

    public AppLauncherPage clickAppLauncher() {
        appLauncher.click();
        return new AppLauncherPage();
    }
}
