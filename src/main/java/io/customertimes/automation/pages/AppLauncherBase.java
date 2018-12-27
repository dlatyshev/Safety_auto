package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class AppLauncherBase extends Base {
    private boolean isOpened = false;
    private SelenideElement header = $("h2[class='slds-text-heading--medium']");
    private SelenideElement searchField = $("div[title=\"Search\"]");



    public void clickOnItemOrApplication(String appNameOrItem){
        $("a[title = \"" + appNameOrItem + "\"] > span > span").click();
    }





}
