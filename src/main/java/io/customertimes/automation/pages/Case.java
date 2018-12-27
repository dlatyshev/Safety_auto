package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class Case extends Base {
    private SelenideElement caseDetails = $("a[title = \"Details\"]");


    public Case() {
        this.isOpened = (pageIsOpened(caseDetails));
    }


    public boolean isOpened() {
        return isOpened;
    }
}
