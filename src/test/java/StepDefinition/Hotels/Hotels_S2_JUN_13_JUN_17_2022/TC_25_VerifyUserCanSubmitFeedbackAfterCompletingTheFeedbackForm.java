package StepDefinition.Hotels.Hotels_S2_JUN_13_JUN_17_2022;

import Pages.Hotels.FeedbackPage;
import Pages.Hotels.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC_25_VerifyUserCanSubmitFeedbackAfterCompletingTheFeedbackForm {

    FeedbackPage feedbackPage = new FeedbackPage();
    LandingPage landingPage = new LandingPage();

    /**
     *
     * TC-25
     *
     * Launch Hotels
     * Select “Website feedback” from Help dropdown
     * Select any star-rating
     * Enter any comments
     * Select any option for “How likely are you to return to [Hotels.com](http://Hotels.com)?”
     * Select any answer for “Prior to this visit, have you ever booked on [Hotels.com](http://Hotels.com)?”
     * Select any answer for ”Did you accomplish what you wanted to do on this page?”
     * Click on Submit button
     * Verify “THANK YOU FOR YOUR FEEDBACK.“ is displayed
     *
     */

    @And("^I click three star rating$")
    public void clickStarRating (){
        feedbackPage.clickThreeStarRating();
    }

    @When("^I switch to Feedback page$")
    public void switchToFeedbackPage (){
        landingPage.switchToFeedbackPage();
    }

    @And("^I click comment box on feedback page$")
    public void clickCommentBox(){
        feedbackPage.clickCommentBox();
    }


    @When("^I type (.+) on comment box on feedback page$")
    public void commentOnCommentBox (String comment){
        feedbackPage.typeOnCommentBox(comment);
    }

    @And("^I click on how likely are you to return on feedback page$")
    public void clickOnHowLikelyAreYouToComeBack (){
        feedbackPage.clickOnHowLikelyAreYouToReturn();
    }

    @And("^I select somewhat likely on feedback page$")
    public void clickSomewhatLikely (){
        feedbackPage.clickSomewhatLikely();
    }

    @And("^I click yes in have you ever booked on hotels on feedback page$")
    public void clickYesOnHaveYouBookedOnHotels (){
        feedbackPage.clickYesOnHaveYouEverBookedOnHotels();
    }

    @And("^I click yes in did you accomplish what you wanted on feedback page$")
    public void clickYesOnDidYouAccomplishWhatYouWanted (){
        feedbackPage.clickYesOnDidYouAccomplishWhatYouWanted();
    }

    @And("^I click submit button on feedback page$")
    public void clickSubmitButton (){
        feedbackPage.clickSubmitButton();
    }


    @Then("^I verify that Thank you for your feedback is displayed$")
    public void verifyIfThankYouForYourFeedbackIsDisplayed (){
        Assert.assertTrue(feedbackPage.verifyThankYouForYourFeedbackIsDisplayed(),"Thank you for your feedback is not displayed");
    }






}
