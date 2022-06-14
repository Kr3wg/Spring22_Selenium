package StepDefinition.Hotels;

import Pages.Hotels.FeedbackPage;
import Pages.Hotels.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class TC_24_VerifyErrorIsDisplayedWhenUserSubmitsTheEmptyFeedbackForm {

    LandingPage lPage = new LandingPage();
    FeedbackPage fPage = new FeedbackPage();

    /**
     *
     * Launch Hotels
     * Select “Sign In” from Help dropdown
     * Click on Submit button
     * Verify error message is displayed (Please fill in the required information highlighted below.)
     * Verify star boxes section is in a red dotted box.
     *
     */


    @When("^I click Feedback link$")
    public void clickFeedbackOnSignIn (){fPage.clickFeedbackLink();}

    @And("^I click submit button$")
    public void clickSubmitButtn (){

        fPage.clickSubmitButton();}



}
