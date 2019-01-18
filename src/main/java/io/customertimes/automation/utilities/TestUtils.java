package io.customertimes.automation.utilities;

import org.openqa.selenium.Keys;
import java.io.*;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.actions;

public class TestUtils {

    public void sleep(long millis) {
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
        actions().sendKeys(Keys.chord(Keys.LEFT_SHIFT, "W")).build().perform();
        actions().sendKeys(Keys.ENTER).build().perform();
    }
}
