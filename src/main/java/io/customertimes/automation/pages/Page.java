package io.customertimes.automation.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.SelenideTargetLocator;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static com.codeborne.selenide.Selenide.*;

public abstract class Page {

    private WebDriverWait wait;
    protected abstract boolean pageIsOpened();

    protected void click(By locator){
        $(locator).click();
    }

    protected SelenideElement type(String text, By locator){
        return $(locator).waitUntil(Condition.appears, 10000).val(text);
    }

//    protected Alert switchToAlert(){
//        wait = new WebDriverWait(getWebDriver(), 10);
//        wait.until(ExpectedConditions.alertIsPresent());
//        return switchTo().alert();
//    }
//
//    protected void switchToFrameByIndex(int index){
//        switchTo().frame(index);
//    }
//
//    protected void switchToFrameByIdOrName(String idOrName){
//        switchTo().frame(idOrName);
//    }
//
//    protected void switchToWindowWithTitle(String title){
//        WebDriver driver = getWebDriver();
//        String firstWindow = driver.getWindowHandle();
//
//        Set<String> allWindows = driver.getWindowHandles();
//        Iterator<String> windowsIterator = allWindows.iterator();
//        while (windowsIterator.hasNext()){
//            String windowHadle = windowsIterator.next();
//
//            if(!windowHadle.equals(firstWindow)){
//                switchTo().window(windowHadle);
//                if(driver.getTitle().equals(title)){
//                    break;
//                }
//            }
//        }
//    }
//
//    public String getCurrentPageTitle(){
//        return getWebDriver().getTitle();
//    }
//
//    protected void pressKey(By locator, Keys key){
//        $(locator).sendKeys(key);
//    }
//
//    protected SelenideElement scrollToElement(By locator){
//        return $(locator).scrollTo();
//    }
//
//    public void scrollToBottom(){
//        executeJavaScript("window.scrollTo(0, document.body.scrollHeight)");
//    }
//
//    protected void performDragAndDrop(By from, By to){
//        $(from).dragAndDropTo($(to));
//    }
//
//    protected SelenideElement hoverOverTheElement(By locator){
//       return $(locator).hover();
//    }
//
//    protected void selectOptionInDropdownByIndex(By locator, int index){
//        $(locator).selectOption(index);
//    }
//
//    protected void selectOptionInDropdownByValue(By locator, String value){
//        $(locator).selectOptionByValue(value);
//    }
//
//    protected void selectOptionInDropdownByContainingText(By locator, String text){
//        $(locator).selectOptionContainingText(text);
//    }





}
