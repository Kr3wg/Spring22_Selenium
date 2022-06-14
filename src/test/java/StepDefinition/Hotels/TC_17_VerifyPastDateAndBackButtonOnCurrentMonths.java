package StepDefinition.Hotels;

import Pages.Hotels.LandingPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import javax.annotation.concurrent.NotThreadSafe;

public class TC_17_VerifyPastDateAndBackButtonOnCurrentMonths {


    LandingPage lPage = new LandingPage();

    /**
     *
     * TC-17
     *
     * Launch [Hotels.com](http://Hotels.com)
     * Click on Checkin Calendar
     * Go to current month if not displayed
     * Verify For current month
     * 1) Past dates (if any) are disabled.
     * 2) Back button on current month is disabled
     * Click on Done button on calendar
     * Click on Checkout Calendar
     * Go to current month if not displayed
     * Verify For current month
     * 1) Past dates (if any) are disabled.
     * 2) Back button on current month is disabled
     *
     */


    @Then("^I verify that current month back button is disabled$")
    public void verifyThatBackButtonIsDisabledONCC (){
        Assert.assertTrue(lPage.isBackButtonDisabled(), "Back Button is enabled");
    }


    @Then("^I verify that past dates are disabled$")
    public void doesPastDatesDisabled() {
        Assert.assertTrue(lPage.arePastDaysDisabled(), "Past days are displayed");
    }






}
