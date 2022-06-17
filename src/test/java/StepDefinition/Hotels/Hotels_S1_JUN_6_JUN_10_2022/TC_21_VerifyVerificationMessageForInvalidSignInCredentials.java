package StepDefinition.Hotels.Hotels_S1_JUN_6_JUN_10_2022;

import Pages.Hotels.LandingPage;
import Pages.Hotels.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC_21_VerifyVerificationMessageForInvalidSignInCredentials {
    LandingPage lPage = new LandingPage();
    SignInPage sPage = new SignInPage();


    /**
     *
     *
     * Launch [hotels](http://hotels.com) website
     * Click on “Sign in” link
     * Enter invalid email address
     * Enter invalid password
     * Click on Sign in button
     * Verify Verification message is displayed.
     *
     */


    @And("^I click sign in button$")
    public void click_sign_in_button (){lPage.clickSignInButton();}

    @And("^I enter (.+) email address in sign in$")
    public void typeEmailADdress (String email){sPage.typeEmailAddressSIP(email);}

    @And("^I enter (.+) password$")
    public void typePassword (String password){sPage.typePassword(password);}

    @And("^I click on sign in button$")
    public void signInButtonInSinP (){sPage.clickSignIndBTonSInP();}

    @Then("^I verify that the message is displayed$")
    public void verifyErrorMessageIsEnabled (){
        Assert.assertTrue(sPage.isErrorMessageDisplayed(),"Message is not displayed");
    }



}
