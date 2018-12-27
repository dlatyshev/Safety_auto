package io.customertimes.automation.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AppLauncherPage extends Page {
    private By header = By.cssSelector("h2[class='slds-text-heading--medium']");

    @Override
    protected boolean pageIsOpened() {
        return $(header).isDisplayed();
    }

    public void clickOnItemOrApplication(String appNameOrItem){
        $("a[title = \"" + appNameOrItem + "\"] > span > span").click();
    }





}
