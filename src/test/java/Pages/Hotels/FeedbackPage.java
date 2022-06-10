package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import org.openqa.selenium.By;

public class FeedbackPage extends Commands {
    By feedBackLocator = By.xpath("//header/nav[@id='secondaryNav']/div[@id='gc-custom-header-nav-bar-acct-menu']/div[1]/div[2]/a[5]/div[1]");
    By submitButtonLocator = By.xpath("//button[@id='submit-button']");


    public void clickSubmitButton (){

        clickItWithScroll(submitButtonLocator);}
    public void clickFeedbackLink (){clickIt(feedBackLocator); Misc.pause(2);}
    public void findElementForNewW (){
        findWebElementWithWait(submitButtonLocator).click();
    }
}
