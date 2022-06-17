package StepDefinition.Hotels.Hotels_S2_JUN_13_JUN_17_2022;

import Pages.Hotels.LandingPage;
import Pages.Hotels.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class TC_23_VerifyFilter_byAndSort_byFunctionalityWorksAsExpected {



    LandingPage landingPage = new LandingPage();
    SearchPage searchPage = new SearchPage();



    /**
     *
     * TC-23
     *
     * Launch Hotels
     * Search Manhattan, NY
     * Enter Check-in date as Aug-10-2022
     * Enter Check-in date as Aug-15-2022
     * Click on Search button
     * Click on 5* from star-rating filter
     * Select “Price” from sort-by dropdown
     * Verify all hotels in search results are *-rated as selected in above step
     * Verify all hotels are listed in increasing order (price).
     *
     */



    @When("^I click on destination search box$")
    public void clickOnDestinationInputBov (){
        landingPage.clickOnDestinationBox();
    }



    @And("^I select Manhattan from suggestions$")
    public void selectManhattanNyFromSearchSuggestion (){
        landingPage.selectManhattanNyFromSelectSuggestions();
    }

    @And("^I click on five star on filter$")
    public void clickOnFiveStarBox (){
        searchPage.clickOnFiveStarBox();
    }

    @And("^I click on sort by box from search page$")
    public void clickOnSortByBox (){
        searchPage.clickOnSortByBox();
    }

    @And("^I click on price from select by dropdown on search page$")
    public void clickOnPriceInSortBy(){
        searchPage.clickOnPriceInSelectBy();
    }

    @Then("^I verify that all the hotels are five star rated$")
    public void verifyHotelsAreAllRatedFiveStars(){
        Assert.assertTrue(searchPage.verifySelectedHotelsAreFiveStarRated(),"Not all Hotels are five star rated");
    }

    @Then("^I verify that prices are in increasing order$")
    public void verifyPriceIsIncreasingOrder (){
        Assert.assertTrue(searchPage.verifyPricesAreInIncreasingOrder(),"They are not in increasing order");
    }




}
