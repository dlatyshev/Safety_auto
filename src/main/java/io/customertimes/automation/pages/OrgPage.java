package io.customertimes.automation.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class OrgPage extends Page {

    private By homeTab = By.xpath("//span[text() = 'Home']");
    private By appLaucher = By.cssSelector("div[class='slds-icon-waffle");

    @Override
    public boolean pageIsOpened() {
       return  $(homeTab).isDisplayed();
    }

    public AppLauncherPage clickAppLauncher(){
        click(appLaucher);
        return new AppLauncherPage();
    }




}
