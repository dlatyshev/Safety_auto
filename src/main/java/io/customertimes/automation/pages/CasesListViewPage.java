package io.customertimes.automation.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CasesListViewPage extends Base {

    private SelenideElement casesListViewPageTitle = $("a[title = \"Cases\"]");
    private SelenideElement selectListViewButton = $("a[title = \"Select List View\"]");

    public CasesListViewPage() {
        this.isOpened = pageIsOpened(casesListViewPageTitle);
    }

    public void selectListViewByName(String name) {
        selectListViewButton.click();
        $(By.xpath("//span[contains(text(), '" + name + "')]")).click();
    }

    public boolean isCasesListViewOpened() {
        return $(By.xpath("//span[@class = \"triggerLinkText selectedListView uiOutputText\" and contains(text(),'Sample Cases')]"))
                .waitUntil(Condition.visible, 10000).isDisplayed();
    }

    public CasePage selectCaseByNumber(String number) {
        $(By.xpath("//th[@scope=\"row\"]//a[text() = \"" + number + "\"]")).click();
        return new CasePage();
    }


}
