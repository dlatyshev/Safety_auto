package io.customertimes.automation.pages;

import org.openqa.selenium.By;

public class AppLauncherPage extends BasePage {
    By header = By.cssSelector("h2[class='slds-text-heading--medium']");

    @Override
    protected boolean pageIsOpened() {
        return findByLocator(header).isDisplayed();
    }

    public void selectApp(String appName){
        findByText(appName).scrollTo().click();
    }

}
