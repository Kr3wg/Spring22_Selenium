package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import org.openqa.selenium.By;

public class DealsPage extends Commands {

    By  manageYourBookingAnytimeAnywhereLocator =By.xpath("//body/div[@id='main-content']/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]");
    By  stayFlexibleWithFreeCancellationLocator = By.xpath("//body/div[@id='main-content']/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/a[1]");
    By  saveOnYourNextTripToTheGreatOutdoorsLocator = By.xpath("//body/div[@id='main-content']/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]");









    public void clickOnManageYourBookingAnytimeAnywhereLink (){

        clickIt(manageYourBookingAnytimeAnywhereLocator);
        Misc.pause(2);
    }

    public void clickOnStayFlexibleWithFreeCancellationLink (){

        clickIt(stayFlexibleWithFreeCancellationLocator);
        Misc.pause(2);
    }

    public void clickOnSaveOnYourNextTripToTheGreatOutdoorsLink (){

        clickIt(saveOnYourNextTripToTheGreatOutdoorsLocator);
        Misc.pause(2);
    }


    public boolean isManageYourBookingAnytimeAnywhereEnabled (){
        return
                isElementEnabled(manageYourBookingAnytimeAnywhereLocator);
    }

    public boolean isManageYourBookingAnytimeAnywhereDisplayed (){
        return
                isElementDisplayed(manageYourBookingAnytimeAnywhereLocator);
    }


    public boolean isStayFlexibleWithFreeCancellationEnabled (){
        return
                isElementEnabled(stayFlexibleWithFreeCancellationLocator);
    }

    public boolean isStayFlexibleWithFreeCancellationDisplayed (){
        return
                isElementDisplayed(stayFlexibleWithFreeCancellationLocator);
    }


    public boolean isSaveOnYourNextTripToTheGreatOutdoorsEnabled (){
        return
                isElementEnabled(saveOnYourNextTripToTheGreatOutdoorsLocator);
    }

    public boolean isSaveOnYourNextTripToTheGreatOutdoorsDisplayed (){
        return
                isElementDisplayed(saveOnYourNextTripToTheGreatOutdoorsLocator);
    }

}
