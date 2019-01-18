package io.customertimes.automation.hooks;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.customertimes.automation.utilities.TestUtils;

import static com.codeborne.selenide.Selenide.*;

public class MasterHook extends TestUtils {

    @Before
    public void setUp() {
        Configuration.screenshots = true;
        Configuration.browser = readProperty("browser");
        Configuration.timeout = 10000;
        Configuration.pageLoadStrategy = "normal";
    }

    @After
    public void tearDown() {
        clearBrowserCookies();
        clearBrowserLocalStorage();
        closeAllTabs();
    }
}
