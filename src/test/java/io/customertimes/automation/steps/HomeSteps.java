package io.customertimes.automation.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.customertimes.automation.pages.HomePage;

public class HomeSteps {

    private HomePage homePage = new HomePage();

    @When("^user clicks on any name of the 'Source Document'$")
    public void user_clicks_on_any_name_of_the_Source_Document() {
        homePage.selectSourceDocumentFromTheList(1);
    }

    @Then("^Source Document Status Review is present$")
    public void source_Document_Status_Review_is_present()  {

    }

    @Then("^Source document list is present$")
    public void source_document_list_is_present()  {

    }

    @Then("^Chatter is present$")
    public void chatter_is_present() {

    }

    @Then("^Recent Records is present$")
    public void recent_Records_is_present() {

    }
}
