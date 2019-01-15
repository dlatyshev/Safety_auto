package io.customertimes.automation.pages;

import org.openqa.selenium.By;

public class CaseNavigation extends Base {

    public CaseNavigation() {
        this.pageTitle = By.xpath("//h4[text() = 'Case Navigation']");
    }
}
