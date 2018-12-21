package io.customertimes.automation.hooks;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.customertimes.automation.utilities.TestUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class MasterHook extends TestUtils {


    @Before
    public void setUp(){

        Configuration.screenshots = true;
        Configuration.browser = readProperty("browser");
    }

    @After
    public void tearDown(){

    }
}
