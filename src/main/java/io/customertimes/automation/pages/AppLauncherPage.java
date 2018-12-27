package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AppLauncherPage extends Page {
    private SelenideElement header = $("h2[class='slds-text-heading--medium']");
    private SelenideElement searchField = $("div[title=\"Search\"]");

    @Override
    protected boolean pageIsOpened() {
        return header.isDisplayed();
    }

    public void clickOnItemOrApplication(String appNameOrItem){
        $("a[title = \"" + appNameOrItem + "\"] > span > span").click();
    }





}
