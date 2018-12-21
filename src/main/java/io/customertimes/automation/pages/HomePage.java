package io.customertimes.automation.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage {

    private By homeTab = By.xpath("//span[text() = 'Home']");
    private By appLaucher = By.cssSelector("button[class='sldc-button");

    @Override
    public boolean pageIsOpened() {
       return  findByLocator(homeTab).isDisplayed();
    }

    public AppLauncherPage clickAppLauncher(){
        click(appLaucher);
        return new AppLauncherPage();
    }




}
