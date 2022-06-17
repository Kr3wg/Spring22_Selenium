package Pages.Hotels;

import Pages.Commands;
import org.openqa.selenium.By;

public class SaveOnYourNextTripToTheGreatOutdoorsPage extends Commands {

    By textSaveOnYourNextTripToTheGreatOutdoorsLocator = By.xpath("//body[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h1[1]");



    public boolean isSaveOnYourNextTripToTheGreatOutdoorsDisplayed (){
        return
                isElementDisplayed(textSaveOnYourNextTripToTheGreatOutdoorsLocator);
    }
}
