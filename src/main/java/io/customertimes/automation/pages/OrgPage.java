package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class OrgPage extends Base {
    private SelenideElement homeTab = $x("//span[text() = 'Home']");
    private SelenideElement appLauncher = $("nav[class=\"appLauncher slds-context-bar__icon-action\"] > button");


    public OrgPage() {
        this.isOpened = pageIsOpened(appLauncher);
    }

    public AppLauncherBase clickAppLauncher(){
        appLauncher.click();
        return new AppLauncherBase();
    }


    public boolean isOpened() {
        return isOpened;
    }
}
