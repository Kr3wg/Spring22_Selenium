package Pages.Hotels;

import Pages.Commands;
import org.openqa.selenium.By;

public class StayFlexibleWithFreeCancellationPage extends Commands {

    By textAmazingDealsWithFreeCancellationLocator  = By.xpath("//h1[contains(text(),'Amazing deals with free cancellation')]");





    public boolean isAmazingDealsWithFreeCancellationDisplayed (){
        return
                isElementDisplayed(textAmazingDealsWithFreeCancellationLocator);
    }
}
