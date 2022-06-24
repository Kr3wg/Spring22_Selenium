package Pages.Hotels;

import Pages.Commands;
import org.openqa.selenium.By;


public class ManageYourBookingAnytimeAnywherePage extends Commands {

    By textSearchBookAndSaveOnTheGoLocator  =By.xpath("//h1[contains(text(),'Search, book, and save on the go!')]");







    public boolean isSearchBookAndSaveOnTheGoDisplayed (){
        return
                isElementDisplayed(textSearchBookAndSaveOnTheGoLocator);
    }










}
