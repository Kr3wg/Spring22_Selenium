package StepDefinition.Hotels.Hotels_S2_JUN_13_JUN_17_2022;

import Pages.Hotels.LandingPage;
import Pages.Hotels.SignUpPage;
import Web.MyDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_22_VerifyErrorMessageForInvalidDataInSignUpForm {


   SignUpPage sUpPage = new SignUpPage();
//     *
//     * TC-22
//     *
//     * Launch Hotels
//     * Click on SignIn link
//     * Click on SignUp link
//     * Enter invalid email address with at least '@' symbol (#!@###)
//     * ->Verify error is displayed (Enter a valid email address)
//     * Enter invalid first name (!@)
//     * ->Verify error is displayed (First name cannot contain special characters)
//     * Enter invalid last name (%^&)
//     * -> Verify error is displayed (Last name cannot contain special characters)
//     * Enter password
//     * Verify “Keep me signed in” checkbox is displayed and enabled
//     * Verify “Continue” button is displayed but NOT enabled
//     *
//     */

    @When("^I click email address box$")
    public void clickEmailAddressBox (){
        sUpPage.clickEmailAddressBox();
    }

    @When("^I enter (.+) email address in sign up page")
    public void typeEmailAdd (String email) {
       sUpPage.typeEmailAddressSUP(email);
    }

    @When("^I enter (.+) first name in sign up page$")
    public void typeFirstName (String firstName){
        sUpPage.typeFirstNameSUP(firstName);
    }

    @And("^I enter (.+) last name in sign up page$")
    public void typeLastName (String lastName){
        sUpPage.typeLastNameSUP(lastName);
    }

    @And("^I enter (.+) password in sign up page$")
    public void typePassword (String password){
        sUpPage.typePasswordSUP(password);
    }

    @Then("^I verify that message Enter a valid email address is displayed in sign up page$")
    public void verifyErrorMessageIsDisplayedUnderEmailBox (){
        Assert.assertTrue(sUpPage.isErrorMessageDisplayedUnderEmailBox());
    }


    @Then("^I verify that message First name cannot contain special characters is displayed in sign up page$")
    public void verifyErrorMessageIsDisplayedUnderFirstNameBox (){
        Assert.assertTrue(sUpPage.isErrorMessageDisplayedUnderFirstNameBox());
    }

    @Then("^I verify that message Last name cannot contain special characters is displayed in sign up page$")
    public void verifyErrorMessageIsDisplayedUnderLastName (){
        Assert.assertTrue(sUpPage.isErrorMessageDisplayedUnderLastNameBox());
    }

    @Then("^I verify that keep me signed in box is enabled in sign up page$")
    public void verifyKeepMeSignedInBoxIsEnabled (){
        Assert.assertTrue(sUpPage.isKeepMeSignedInBoxEnabled());
    }

    @Then("^I verify that text Keep me signed in is displayed$")
    public void verifyMessageKeepMeSignedInIsDisplayed (){
        Assert.assertTrue(sUpPage.isKeepMeSignedInTextDisplayed());
    }

    @Then("^I verify that continue button is displayed in sign up page$")
    public void verifyContinueButtonIsDisplayed (){
        Assert.assertTrue(sUpPage.isContinueButtonDisplayed());
    }

    @Then("^I verify that continue button is not enabled in sign up page$")
    public void verifyContinueButtonIsNotEnabled(){
        Assert.assertFalse(sUpPage.isContinueButtonEnabled());
    }



    @Then("^I enter (.+) in the email box$")
    public void enterEmail (String input){
        sUpPage.enterEmail(input);
    }


}
