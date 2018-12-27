package io.customertimes.automation.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import io.customertimes.automation.pages.HomePage;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @When("^user clicks on any name of the 'Source Document'$")
    public void user_clicks_on_any_name_of_the_Source_Document() {
        homePage.selectSourceDocumentFromTheList(1);
    }
}
