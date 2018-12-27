package io.customertimes.automation.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class OrgPage extends Page {

    private By homeTab = By.xpath("//span[text() = 'Home']");
    private By appLauncher = By.cssSelector("nav[class=\"appLauncher slds-context-bar__icon-action\"] > button");

    @Override
    public boolean pageIsOpened() {
       return  $(homeTab).isDisplayed();
    }

    public AppLauncherPage clickAppLauncher(){
        click(appLauncher);
        return new AppLauncherPage();
    }




}
