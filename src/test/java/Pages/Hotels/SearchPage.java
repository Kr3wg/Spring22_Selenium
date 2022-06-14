package Pages.Hotels;

import Pages.Commands;
import org.openqa.selenium.By;

public class SearchPage extends Commands {

    By tellUsHowWeCanImproveTxtLocator = By.xpath("//span[contains(text(),'Tell us how we can improve our site')]");
    By shareFeedbackButtonLocator = By.xpath("//a[contains(text(),'Share feedback')]");

    public boolean isTellUsHowWeCanImproveEnabled (){
        return
                isElementDisplayed(tellUsHowWeCanImproveTxtLocator);
    }

    public boolean isShareFeedbackButtonEnabled (){
        return
                isElementDisplayed(shareFeedbackButtonLocator);
    }










}
