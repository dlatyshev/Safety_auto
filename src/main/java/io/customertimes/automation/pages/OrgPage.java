package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class OrgPage extends Page {

    private SelenideElement homeTab = $x("//span[text() = 'Home']");
    private SelenideElement appLauncher = $("nav[class=\"appLauncher slds-context-bar__icon-action\"] > button");

    @Override
    public boolean pageIsOpened() {
       return  homeTab.isDisplayed();
    }

    public AppLauncherPage clickAppLauncher(){
        appLauncher.click();
        return new AppLauncherPage();
    }




}
