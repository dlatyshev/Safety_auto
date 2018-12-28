package io.customertimes.automation.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class CasePage extends Base {

    private SelenideElement caseDetails = $("a[title = \"Details\"]");

    public CasePage() {
        this.isPageOpened = (pageIsOpened(caseDetails));
    }

    public boolean isOpened() {
        return isPageOpened;
    }
}
