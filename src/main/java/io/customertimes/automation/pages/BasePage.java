package io.customertimes.automation.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.WebDriverRunner.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public abstract class BasePage {
    private WebDriverWait wait;
    protected abstract boolean pageIsOpened();

    protected void click(By locator){
        $(locator).click();
    }

    protected void type(String text, By locator){
        $(locator).waitUntil(Condition.appears, 10000).val(text);
    }

    protected SelenideElement findByLocator(By locator){
        return $(locator).waitUntil(Condition.appears, 10000);
    }

    protected SelenideElement findByText(String text){
        return $(byText(text));
    }

    protected ElementsCollection findAllByLocator(By locator){
        return $$(locator);
    }

    protected Alert switchToAlert(){
        wait = new WebDriverWait(getWebDriver(), 10);
        wait.until(ExpectedConditions.alertIsPresent());
        return switchTo().alert();
    }

    protected void switchToWindowWithTitle(String title){
        WebDriver driver = getWebDriver();
        String firstWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> windowsIterator = allWindows.iterator();
        while (windowsIterator.hasNext()){
            String windowHadle = windowsIterator.next();

            if(!windowHadle.equals(firstWindow)){
                switchTo().window(windowHadle);
                if(driver.getTitle().equals(title)){
                    break;
                }
            }
        }
    }

    public String getCurrentPageTitle(){
        return getWebDriver().getTitle();
    }

    protected void pressKey(By locator, Keys key){
        $(locator).sendKeys(key);
    }

    protected SelenideElement scrollToElement(By locator){
        return $(locator).scrollTo();
    }

    public void scrollToBottom(){
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    protected void performDragAndDrop(By from, By to){
        $(from).dragAndDropTo($(to));
    }

    protected SelenideElement hoverOverTheElement(By locator){
       return $(locator).hover();
    }




}
