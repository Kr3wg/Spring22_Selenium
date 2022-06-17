package StepDefinition.Hotels.Hotels_S1_JUN_6_JUN_10_2022;

import Pages.Hotels.LandingPage;
import Pages.Hotels.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC_19_VerifyShareFeedbackSD {

    LandingPage lPage = new LandingPage();
    SearchPage searchP = new SearchPage();

    /**
     * TC-19
     * Hotels: Verify Share feedback button is displayed at the end of search results
     * Launch [Hotels.com](http://Hotels.com)
     * Enter “bora” in destination
     * Select “Bora Bora, Leeward Islands, French Polynesia” from auto suggestion
     * Select August 1, 2022 as Check-in
     * Select August 10, 2022 as Check-out
     * Click Apply
     * Click on “Search”button
     * Verify at the end of search results:
     * Text: Tell us how we can improve our site is displayed
     * Button [Share feedback] is displayed and enabled
     */



    @When("^I enter (.+) in destination$")
    public void Enter_In_Destination (String destination){
        lPage.enterDestination(destination);
    }
    @When("^I select (.+) from suggestion$")
    public void clickTheDestination (String destination){
    lPage.selectFromDestinationSuggestion(destination);
    }

    @When("I click check in button on LP")
    public void clickCheckInButton (){
        lPage.clickCheckInBox();
    }

    @When("^I select (.+) as Check-in on LP$")
    public void selectCheckInDate (String Date){
        lPage.selectDateFromAnyMonth(Date);
    }

    @And("I click done button in calendar")
    public void clickDoneButtonInCalendar (){
        lPage.clickDoneButtonOnCalendar();
    }

    @And("I click check out button")
    public void clickCheckOutButton (){
        lPage.clickCheckOutButton();
    }

    @And("^I select (.+) as checkout$")
    public void selectCheckOutDate (String Data){
        lPage.selectDateFromAnyMonth(Data);
    }

    @When("I click on search button")
    public void clickOnSearchButton (){
        lPage.clickSearchButton();
    }

    @Then("^I verify that the message tell us how we can improve is displayed$")
    public void verifyIsTellUsHowWeCanImproveEnabled (){
        Assert.assertTrue(searchP.isTellUsHowWeCanImproveEnabled());
    }

    @Then("^I verify that share button is enabled")
    public void verifyIfShareButtonIsDisplayed (){
        Assert.assertTrue(searchP.isShareFeedbackButtonEnabled());
    }






}
