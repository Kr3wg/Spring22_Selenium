package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class LandingPage extends Commands {

    //
    By checkInDateBoxLocator = By.id("d1-btn");
    By checkInDisabledDatesLocator = By.xpath("//table[@class='uitk-date-picker-weeks']//button[@disabled]");


    By june2022DatesLocator = By.xpath("//h2[text()='June 2022']/following-sibling::table//button[@data-day]");
    /*

        monthYear = August 2022
        "//h2[text()='" + monthYear + "']/following-sibling::table//button[@data-day]"
        monthDates_1 + monthYear + monthDates_2
     */

    String monthDates_1 = "//h2[text()='";
    String monthDates_2 = "']/following-sibling::table//button[@data-day]";

    By calendarHeading = By.xpath("(//div[@data-stid='date-picker-month'])[1]//h2");
    By nextMonthArrow = By.xpath("(//button[@data-stid='date-picker-paging'])[2]");
    By signInLinkLocator = By.xpath("//button[contains(text(),'Sign in')]");
    By signUpLinkLocator = By.xpath("//a[@data-stid='link-header-account-signup']");
    By doneButtonOnCalendarLocator = By.xpath("//button[contains(text(),'Done')and@data-stid]");
    By searchBarLocator = By.xpath("//button[@id='submit_button']");
    By travelersButtonLocator = By.xpath("//button[contains(text(),'1 room, 2 travelers')]");
    By signInButtonLocator = By.xpath("//a[contains(text(),'Sign in')]");
    By backButtonInCCLocator = By.xpath("(//button[@data-stid='date-picker-paging'])[1]");
    By disabledDatesInCCLocator = By.xpath("//table[@class='uitk-date-picker-weeks']//button[@disabled]");
    By backButtonInCOCLocator = By.xpath("//div[contains(text(),'More travel')]");
    By disabledDatesInCOCLocator = By.xpath("");
    By checkInBoxLocator = By.id("date_form_field-btn");
    By moreTravelLinkLocator = By.xpath("//div[contains(text(),'More travel')]");
    By dealsLinkLocator = By.xpath("//header/div[1]/nav[1]/div[1]/div[1]/div[1]/a[1]/div[1]");
    By dropDownManhattanLocator = By.xpath("//body/div[@id='app-blossom-flex-ui']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[2]/div[1]/div[1]/section[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/button[1]/div[1]/div[2]");



    By destinationInputBoxLocator = By.xpath("//body/div[@id='app-blossom-flex-ui']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[2]/div[1]/div[1]/section[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]");
    By destinationInputLocator = By.id("destination_form_field");
    By destinationSuggestions = By.xpath("//div[@class='uitk-typeahead-results']//div[contains(@class,'truncat') and not(contains(@class,'uitk'))]");
    By boraBoraFromSuggestionLocator = By.xpath("//body/div[@id='app-blossom-flex-ui']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/button[1]/div[1]/div[2]");
    By checkOutButtonLocator = By.xpath("//button[@id='d2-btn']");




    public void selectManhattanNyFromSelectSuggestions (){
        clickIt(dropDownManhattanLocator);
    }

    public void clickMoreTravelLink (){
        clickIt(moreTravelLinkLocator);
    }

    public void clickOnDestinationBox(){
        clickIt(destinationInputBoxLocator);
    }

    public void clickDealsLinkUnderMoreTravel (){
        clickIt(dealsLinkLocator);
        Misc.pause(3);
    }


    public void Hotels_Landing_Page(){
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com/");}

    public void maximizeWindow (){
        MyDriver.maximizeWindow();
    }

    public void clickSignInButton (){clickIt(signInButtonLocator);
    Misc.pause(2);}
    public void clickTravelersButton (){clickIt(travelersButtonLocator);
    Misc.pause(2);}
    public void clickCheckInBox() {clickIt(checkInBoxLocator);
    Misc.pause(2);}
    public void clickSearchButton(){clickIt(searchBarLocator);
    Misc.pause(2);}
    public void clickSignInLink (){clickIt(signInLinkLocator);
    Misc.pause(2);}
    public void clickSignUpLink (){clickIt(signUpLinkLocator);
    Misc.pause(3);}
    public void clickBoraBora (){clickIt(boraBoraFromSuggestionLocator);
    Misc.pause(2);}

    public void clickCheckOutButton (){clickIt(checkOutButtonLocator);
    Misc.pause(2);}
    public boolean isBackButtonDisabled() {
        return isElementDisplayed(backButtonInCCLocator);}
    public boolean arePastDaysDisabled() {
        return isElementDisplayed(disabledDatesInCCLocator);
    }


    public void clickDoneButtonOnCalendar (){clickIt(doneButtonOnCalendarLocator);
    Misc.pause(2);}


    public List<WebElement> getAllDisabledDates() {
        return findWebElements(checkInDisabledDatesLocator);
    }

    public void selectDateInJune2022(String dateToSelect) {
        selectDateInCalendar(june2022DatesLocator, dateToSelect);
    }



    public void enterDestination(String destination) {
        type(destinationInputLocator, destination);
        Misc.pause(2);
    }



    public void selectFromDestinationSuggestion(String userChoice) {
        selectFromSuggestions(destinationSuggestions, userChoice);
    }

    public void goToMonth(String monthYear) {
        for (int i=0 ; i<12 ; i++) {
            if (getTextOfWebElement(calendarHeading).equalsIgnoreCase(monthYear)) {
                break;
            }
            clickIt(nextMonthArrow);
        }
    }

    public void selectDateFromAnyMonth(String monthYear, String dateValue) {
        goToMonth(monthYear);
        By allDatesLocator = By.xpath(monthDates_1 + monthYear + monthDates_2);
        selectDateInCalendar(allDatesLocator, dateValue);
    }


    public void selectDateFromAnyMonth(String dateMonthYear) {
        String[] dateValues = dateMonthYear.split(" ");
        goToMonth(dateValues[1] + " " + dateValues[2]);
        By allDatesLocator = By.xpath(monthDates_1 + dateValues[1] + " " + dateValues[2] + monthDates_2);
        selectDateInCalendar(allDatesLocator, dateValues[0]);
        Misc.pause(2);
    }

    public void switchToFeedbackPage () {
        String presentWindowHandle = MyDriver.getDriver().getWindowHandle();
        Set<String> allWindows = MyDriver.getDriver().getWindowHandles();
        for (String window : allWindows) {
            if (!presentWindowHandle.equalsIgnoreCase(window)) {
                MyDriver.getDriver().switchTo().window(window);
            }
        }
        Misc.pause(3);
    }



}
