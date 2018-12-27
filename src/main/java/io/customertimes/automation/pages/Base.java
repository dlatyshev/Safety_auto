package io.customertimes.automation.pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public abstract class Base {
    protected boolean isOpened;

    protected boolean pageIsOpened(SelenideElement... elements){
        boolean result;
       for(SelenideElement element: elements){
          result = element.waitUntil(Condition.exist, 10000).exists();
          if(!result){
              return false;
          }
       }
       return true;
    }
}
