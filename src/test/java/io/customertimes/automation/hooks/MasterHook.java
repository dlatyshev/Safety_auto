package io.customertimes.automation.hooks;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class MasterHook {


    @Before
    public void setUp(){
        Configuration.screenshots = true;
        Configuration.browser = "chrome";
    }

    @After
    public void tearDown(){

    }
}
