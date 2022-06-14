package StepDefinition.Hotels;

import Pages.Hotels.LandingPage;
import io.cucumber.java.en.When;

public class TC_18_VerifyUserCanUpdateNumberOfGuestsOnHomePage {


    LandingPage lPage = new LandingPage();
    /**
     *
     * TC-18
     *
     *1. Launch [Hotels.com](http://Hotels.com)
     * 1. Click on Travelers
     * 1. Select “Adults as 6
     * 1. Select “Children” as 2
     * 1. Select first child age: 4
     * 1. Select second child age: Under 1
     * 1. Click Done
     * 1. Verify total number of guests in sum of adults and children as same as selected on step #3 and #4.
     *
     */

    @When("^I click travelers button$")
    public void clickOnTravelers (){lPage.clickTravelersButton();}



}
