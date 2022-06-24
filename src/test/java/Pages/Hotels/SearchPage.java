package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class SearchPage extends Commands {

    By tellUsHowWeCanImproveTxtLocator = By.xpath("//span[contains(text(),'Tell us how we can improve our site')]");
    By shareFeedbackButtonLocator = By.xpath("//a[contains(text(),'Share feedback')]");
    By fiveStarBoxLocator = By.xpath("//span[contains(text(),'5★')]");
    By sortByBoxLocator = By.id("sort");
    By selectPriceOnSortBy = By.xpath("//select[@id='sort']/option[contains(text(),'Price')][1]");
    By fiveStarHotelsLocators= By.xpath("//div[@class='uitk-rating']//span[text()='5 out of 5']");
    By hotelsPriceLocator = By.xpath("//div[@data-test-id='price-summary-message-line']//div/span/div");

    public boolean isTellUsHowWeCanImproveEnabled (){
        return
                isElementDisplayed(tellUsHowWeCanImproveTxtLocator);
    }

    public boolean isShareFeedbackButtonEnabled (){
        return
                isElementDisplayed(shareFeedbackButtonLocator);
    }
        public void clickOnFiveStarBox (){
            clickIt(fiveStarBoxLocator);
    }

    public void clickOnSortByBox (){
        clickIt(sortByBoxLocator);
    }

    public void clickOnPriceInSelectBy (){
        clickIt(selectPriceOnSortBy);
        clickIt(sortByBoxLocator);
        Misc.pause(3);
    }

    public boolean verifySelectedHotelsAreFiveStarRated(){
        boolean isItFiveStar = false;
        List<WebElement> fiveStarHotels = findWebElements(fiveStarHotelsLocators);
        String fiveStarText = "5 out of 5";
        for(WebElement hotel : fiveStarHotels ){
            String textValue = hotel.getText();
            if(textValue.equals(fiveStarText)){
                isItFiveStar=true;
            }
        }
        return isItFiveStar;
    }

    public boolean verifyPricesAreInIncreasingOrder(){

        List<WebElement> prices = findWebElements(hotelsPriceLocator);

        Double[] hotelsPrice = new Double[prices.size()];
        Double[] hotelsPriceCopy = new Double[prices.size()];

        for (int i = 0 ; i < prices.size();i++){
            hotelsPrice[i]=Double.parseDouble(prices.get(i).getText().substring(1,4));

            hotelsPriceCopy[i]=Double.parseDouble(prices.get(i).getText().substring(1,4));
        }
        Arrays.sort(hotelsPrice);

        boolean isItEqual = Arrays.equals(hotelsPrice,hotelsPriceCopy);
        return isItEqual;
    }












}
