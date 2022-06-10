package StepDefinition.Hotels;

import Helper.Misc;
import Pages.Commands;
import Pages.Hotels.LandingPage;
import Pages.Hotels.SignUpPage;
import Web.MyDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC_20_VerifyTCLinkAndPSLinkSD {

    LandingPage lPage = new LandingPage();
    SignUpPage sUpPage = new SignUpPage();
    Commands cPage = new Commands();

    /**
     *
     * TC-20
     *
     * Hotels: Verify TermsAndConditions link and PrivacyStatements link open correct page on new tab
     * Launch [Hotels.com](http://Hotels.com)
     * Click Sign in link
     * Click Sign up link
     * Click “Terms and Conditions” link
     * Verify “Terms and Conditions” page opens in new tab
     * Click “Privacy Statement” link
     * Verify “Privacy Statement” page opens in new tab
     */

    @Given("^I am on Hotels Landing Page$")
    public void Hotels_Landing_Page(){

        MyDriver.launchUrlOnNewWindow("https://www.hotels.com/");
    }

    @When("^I click sign in link$")
    public void Click_Sign_In_Link (){
        lPage.clickSignInLink();

    }

    @When("I click sign up link")
    public void Click_Sign_Up_Link (){
        MyDriver.getDriver().manage().window().maximize();
        lPage.clickSignUpLink();
    }

    @And("I click terms and conditions link")
    public void Click_Terms_And_Conditions_Link (){
        sUpPage.clickTermsAndConditionsLink();
    }

    @Then("^I verify terms and conditions page opens in new tab$")
    public void verifyTCPInNewTab (){
        Assert.assertEquals(sUpPage.verifyTCPInNewT(),
                "Hotels.com - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations");

    }


    @And("I click privacy statements link")
    public void Click_Privacy_Statements_Link (){
        sUpPage.clickPrivacyStatementsLink();
    }


    @Then("^I verify privacy statement page opens in new tab$")
    public void verifyPrivacyStatementInNewTab (){
        Assert.assertEquals(sUpPage.verifyPrivacyStatementInNewTab(),
                "Privacy Statement");}



}
