package io.customertimes.automation.utilities;

import java.io.File;
import static com.codeborne.selenide.Selenide.*;


public class TestUtils {
    protected void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }

}
