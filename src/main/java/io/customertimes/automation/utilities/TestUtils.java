package io.customertimes.automation.utilities;

import java.io.*;
import java.util.Properties;

public class TestUtils {

    protected void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }

    protected String readProperty(String propertyName){
        Properties property = new Properties();
        FileInputStream fs = null;
        try {
            fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties");
            property.load(fs);
        } catch (IOException ex){
            ex.printStackTrace();
        }

        return property.getProperty(propertyName);
    }
}
