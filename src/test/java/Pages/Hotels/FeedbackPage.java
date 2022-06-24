package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import org.openqa.selenium.By;


public class FeedbackPage extends Commands {
    By feedBackLocator = By.xpath("//div[contains(text(),'Feedback')]");
    By submitButtonLocator = By.id("submit-button");
    By threeStarRatingLocator = By.xpath("//body/div[@id='container']/div[@id='survey']/fieldset[@id='required_box_page_rating']/div[1]/div[3]/label[1]");
    By commentBoxLocator = By.id("verbatim");
    By howLikelyAreYouToReturnLocator = By.id("will-you-return");
    By somewhatLikelyLocator = By.xpath("//option[contains(text(),'Somewhat likely')]");
    By haveYouEverBookedOnHotelsCom_YesLocator = By.xpath("//body/div[@id='container']/div[@id='survey']/fieldset[2]/div[1]/div[1]");
    By didYouAccomplishWhatYouWanted_Yeslocator = By.xpath("//body/div[@id='container']/div[@id='survey']/fieldset[3]/div[1]/div[1]");
    By thankYouForYourFeedbackTextlocator = By.xpath("//h5[contains(text(),'THANK YOU FOR YOUR FEEDBACK.')]");







    public void clickSubmitButton() {
        clickItWithScroll(submitButtonLocator);
        Misc.pause(3);
    }

    public void clickFeedbackLink() {
        clickIt(feedBackLocator);
        Misc.pause(4);
    }

    public void clickThreeStarRating() {
        clickIt(threeStarRatingLocator);

    }

    public void clickCommentBox (){
        clickIt(commentBoxLocator);
    }

    public void typeOnCommentBox (String comment){
        type(commentBoxLocator,comment);
    }

    public void clickOnHowLikelyAreYouToReturn (){
        clickIt(howLikelyAreYouToReturnLocator);
    }

    public void clickSomewhatLikely (){
        clickIt(somewhatLikelyLocator);
        clickIt(howLikelyAreYouToReturnLocator);
    }

    public void clickYesOnHaveYouEverBookedOnHotels (){
        clickIt(haveYouEverBookedOnHotelsCom_YesLocator);
    }

    public void clickYesOnDidYouAccomplishWhatYouWanted (){
        clickIt(didYouAccomplishWhatYouWanted_Yeslocator);
    }

    public boolean verifyThankYouForYourFeedbackIsDisplayed (){
        return
                isElementDisplayed(thankYouForYourFeedbackTextlocator);
    }












}