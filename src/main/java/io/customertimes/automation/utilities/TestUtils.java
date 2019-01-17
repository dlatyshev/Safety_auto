package io.customertimes.automation.utilities;

import com.codeborne.selenide.ElementsCollection;
import gherkin.lexer.El;
import org.openqa.selenium.WebElement;

import java.io.*;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.xpath;

public class TestUtils {

    protected void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }

    protected String readProperty(String propertyName) {
        Properties property = new Properties();
        FileInputStream fs = null;
        try {
            fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties");
            property.load(fs);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return property.getProperty(propertyName);
    }

    public static void closeAllTabs() {
        ElementsCollection tabs = $$(xpath("//button[contains(@title, \"Close\")]"));
        if(tabs.size() != 0) {
            for (WebElement tab : tabs) {
                tab.click();
            }
        }
    }
}
