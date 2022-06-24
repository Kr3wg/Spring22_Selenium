package StepDefinition.Hotels.Hotels_S2_JUN_13_JUN_17_2022;

import Pages.Hotels.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC_26_VerifyLinksOnDealsPage {


    LandingPage landingPage = new LandingPage();
    DealsPage dealsPage = new DealsPage();
    ManageYourBookingAnytimeAnywherePage manageYourBookingAnytimeAnywherePage = new ManageYourBookingAnytimeAnywherePage();
    StayFlexibleWithFreeCancellationPage stayFlexibleWithFreeCancellationPage = new StayFlexibleWithFreeCancellationPage();
    SaveOnYourNextTripToTheGreatOutdoorsPage saveOnYourNextTripToTheGreatOutdoorsPage = new SaveOnYourNextTripToTheGreatOutdoorsPage();

    /**
     *
     * TC-26
     *
     * Launch Hotels
     * Using “More travel” go to “Deals” page
     * Verify “Manage your booking anytime, anywhere” is displayed and enabled
     * Verify “Stay Flexible with free cancellation” is displayed and enabled
     * Verify “Save on your next trip to the great outdoors” is displayed and enabled
     *
     * Click on “Manage your booking anytime, anywhere”
     * Verify “Search, book and Save on the go!” title is displayed
     * Go back
     * Click on “Stay Flexible with free cancellation”
     * Verify “Amazing deals with free cancellation” OR “Stay Flexible with free cancellation” title is displayed
     * Go back
     * Click on “Save on your next trip to the great outdoors”
     * Verify “Save on your next trip to the great outdoors” title is displayed
     *
     */

    @When("^I click more travel link on landing page$")
    public void clickMoreTravelLink (){
        landingPage.clickMoreTravelLink();
    }

    @When("^I click deals link under more travel$")
    public void clickDealsLinkUnderMoreTravel (){
        landingPage.clickDealsLinkUnderMoreTravel();
    }

    @Then("^I verify that Manage Your Booking Anytime Anywhere is enabled$")
    public void VerifyIfManageYourBookingAnytimeAnywhereIsEnabled (){
        Assert.assertTrue(dealsPage.isManageYourBookingAnytimeAnywhereEnabled());
    }

    @Then("^I verify that Manage Your Booking Anytime Anywhere is displayed$")
    public void VerifyIfManageYourBookingAnytimeAnywhereIsDisplayed (){
        Assert.assertTrue(dealsPage.isManageYourBookingAnytimeAnywhereDisplayed());
    }

    @Then("^I verify that Stay Flexible With Free Cancellation is enabled$")
    public void VerifyIfStayFlexibleWithFreeCancellationIsEnabled (){
        Assert.assertTrue(dealsPage.isStayFlexibleWithFreeCancellationEnabled());
    }

    @Then("^I verify that Stay Flexible With Free Cancellation is displayed$")
    public void VerifyIfStayFlexibleWithFreeCancellationIsDisplayed (){
        Assert.assertTrue(dealsPage.isStayFlexibleWithFreeCancellationDisplayed());
    }


    @Then("^I verify that Save On Your Next Trip To The Great Outdoors is enabled$")
    public void VerifyIfSaveOnYourNextTripToTheGreatOutdoorsIsEnabled (){
        Assert.assertTrue(dealsPage.isSaveOnYourNextTripToTheGreatOutdoorsEnabled());
    }

    @Then("^I verify that Save On Your Next Trip To The Great Outdoors is displayed$")
    public void VerifyIfSaveOnYourNextTripToTheGreatOutdoorsIsDisplayed (){
        Assert.assertTrue(dealsPage.isSaveOnYourNextTripToTheGreatOutdoorsDisplayed());
    }


    @When("^I click Manage Your Booking Anytime Anywhere on deals page$")
    public void clickManageYourBookingAnytimeAnywhere (){
        dealsPage.clickOnManageYourBookingAnytimeAnywhereLink();
    }

    @When("^I click back button$")
    public void goToPreviousPage (){
        landingPage.goBackToPreviousPage();
    }

    @Then("^I verify that text Search Book And Save On The Go Is Displayed$")
    public void verifySearchBookAndSaveOnTheGoIsDisplayed (){
        Assert.assertTrue(manageYourBookingAnytimeAnywherePage.isSearchBookAndSaveOnTheGoDisplayed());
    }


    @Then("^I click Stay Flexible With Free Cancellation on deals page$")
    public void clickStayFlexibleWithFreeCancellation (){
        dealsPage.clickOnStayFlexibleWithFreeCancellationLink();
    }

    @Then("^I verify that text Amazing Deals With Free Cancellation Is Displayed$")
    public void verifyAmazingDealsWithFreeCancellationIsDicplayed (){
        Assert.assertTrue(stayFlexibleWithFreeCancellationPage.isAmazingDealsWithFreeCancellationDisplayed());
    }

    @When("^I click Save On Your Next Trip To The Great Outdoors on deals page$")
    public void clickSaveOnYourNextTripToTheGreatOutdoors (){
        dealsPage.clickOnSaveOnYourNextTripToTheGreatOutdoorsLink();
    }

    @Then("^I verify that text Save On Your Next Trip To The Great Outdoors Is Displayed$")
    public void verifySaveOnYourNextTripToTheGreatOutdoorsIsDisplayed (){
        Assert.assertTrue(saveOnYourNextTripToTheGreatOutdoorsPage.isSaveOnYourNextTripToTheGreatOutdoorsDisplayed());
    }

}