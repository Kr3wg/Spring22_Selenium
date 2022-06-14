package Class4;

import Helper.Misc;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.awt.*;

public class Homework2 {

    // Due date: Apr-28

    /**
     * Testcase-1:
     * <p>
     * <p>
     * Verify "Keep me signed in" is NOT selected for messenger login page
     * <p>
     * Click "Log in" button
     * <p>
     * Verify "Incorrect email or phone number" is displayed
     * <p>
     * Verify "Continue" button is enabled
     */


    @AfterMethod
    public void pause() {

        Misc.pause(3);
    }


    @Test
    public void openMessenger() {

        MyDriver.launchUrlOnNewWindow("https://www.facebook.com/");
        String messengerText = "Messenger";
        By messengerLocator = By.linkText(messengerText);
        WebElement messengerLink = MyDriver.getDriver().findElement(messengerLocator);

        String hrefValue = messengerLink.getAttribute("href");
        Assert.assertTrue(hrefValue.contains("messenger.com"), "href on messenger link is incorrect");


        messengerLink.click();

        String urlAfterLink = MyDriver.getDriver().getCurrentUrl();
        Assert.assertTrue(urlAfterLink.contains("messenger.com"), "Url is incorrect");

        MyDriver.getDriver().manage().window().maximize();
    }


    @Test
    public void checkKeepMeSignIn() {


        openMessenger();


        String checkBoxXPath = "//input[@type='checkbox']/following-sibling::span";
        By checkBoxLocator = By.xpath(checkBoxXPath);
        WebElement checkBoxKeepMeLogIN = MyDriver.getDriver().findElement(checkBoxLocator);
        Assert.assertEquals(false, checkBoxKeepMeLogIN.isSelected());

    }


    @Test
    public void clickLogInButton() {


        checkKeepMeSignIn();


        String logInEmailId = "email";
        By logInEmailLocator = By.id(logInEmailId);
        WebElement logInEmail = MyDriver.getDriver().findElement(logInEmailLocator);
        logInEmail.sendKeys("kreshniknikci@hotmail.com");


        String logInPass = "pass";
        By logInPassLocator = By.id(logInPass);
        WebElement logInPassword = MyDriver.getDriver().findElement(logInPassLocator);
        logInPassword.sendKeys("TechnoSoft*@2022");


        String logInButton = "loginbutton";
        By logInButtonLocator = By.id(logInButton);
        WebElement logInBtn = MyDriver.getDriver().findElement(logInButtonLocator);


        logInBtn.click();


    }


    @Test
    public void errorMessage() {


        clickLogInButton();


        String errorMsgXpath = "//div[contains(text(),'Incorrect Email')]";
        By loginErrorLocator = By.xpath(errorMsgXpath);
        WebElement loginError = MyDriver.getDriver().findElement(loginErrorLocator);
        Assert.assertEquals(loginError.getText(), "Incorrect Email", "Login error is not displayed");
        //Assert.assertEquals(loginError.getText(), errorMsgXpath, "Login error is not displayed");


        //By loginbutton = By.xpath("//button[@text='Continue']");


        //MyDriver.quitWindows();
    }


    @Test
    public void verifyContinueButtonIsEnabled() {


        errorMessage();


        String continueButtonStr = "loginbutton";
        By continueLocatorById = By.id(continueButtonStr);
        WebElement continueButton = MyDriver.getDriver().findElement(continueLocatorById);
        Assert.assertEquals(true, continueButton.isEnabled());


    }

    @AfterSuite
    public void closeWindows() {
        MyDriver.quitWindows();
    }


    /**
     * Testcase-2:
     * On Create new account page:
     * <p>
     * Verify the "Sign Up" button is enabled when user lands on the form
     * <p>
     * Enter the below details in Sign Up form EXCEPT DOB
     * First name
     * Last name
     * email
     * re-enter email
     * new password
     * click Sign Up
     * <p>
     * Verify "Please choose a gender. You can change who can see this later." is displayed
     */


    @Test
    public void verifySignUpButton() {

        MyDriver.launchUrlOnNewWindow("https://www.facebook.com/");

        By createNewAccountLocator = By.partialLinkText("Create new account");
        WebElement createNewAccBtn = MyDriver.getDriver().findElement(createNewAccountLocator);

        createNewAccBtn.click();

        String signUpButtonLinkText = "Sign Up";
        By signUpButtonLocator = By.linkText(signUpButtonLinkText);
        WebElement signUpButton = MyDriver.getDriver().findElement(signUpButtonLocator);
        Assert.assertEquals(true, signUpButton.isEnabled());


        Misc.pause(3);
        MyDriver.quitWindows();
    }

    @Test

    public void enterDetails (){

        MyDriver.launchUrlOnNewWindow("https://www.facebook.com/");

        By createNewAccountLocator = By.partialLinkText("Create new account");
        WebElement createNewAccBtn = MyDriver.getDriver().findElement(createNewAccountLocator);

        createNewAccBtn.click();
        Misc.pause(3);

        MyDriver.getDriver().manage().window().maximize();
        String firstNameByContains = "//div[@id='fullname_field']//input[@name='firstname']";
        By firstNameLocationByXpath = By.xpath(firstNameByContains);
        WebElement firstName = MyDriver.getDriver().findElement(firstNameLocationByXpath);
        firstName.sendKeys("kreshnik");


        String lastNameById = "lastname";
        By lastNameLocationByName = By.name(lastNameById);
        WebElement lastName = MyDriver.getDriver().findElement(lastNameLocationByName);
        lastName.sendKeys("nikci");


        String mobileNumberOrEmailById = "//div[contains(text(),'number or email')]/following-sibling::input";
        By mobileNumberOrEmailLocationByXpath = By.xpath(mobileNumberOrEmailById);
        WebElement mobileNumberOrEmail = MyDriver.getDriver().findElement(mobileNumberOrEmailLocationByXpath);
        mobileNumberOrEmail.sendKeys("kreshnik.nikci@gmail.com");




        String reEnterEmailByXpath = "//div[contains(text(),'Re-enter email')]/following-sibling::input";
        By reEnterEmailLocationByXpath = By.xpath(reEnterEmailByXpath);
        WebElement reEnterEmail = MyDriver.getDriver().findElement(reEnterEmailLocationByXpath);
        reEnterEmail.sendKeys("kreshnik.nikci@gmail.com");



        String newPasswordById = "//div[contains(text(),'New password')]/following-sibling::input";
        By newPasswordLocationByID = By.xpath(newPasswordById);
        WebElement newPassword = MyDriver.getDriver().findElement(newPasswordLocationByID);
        newPassword.sendKeys("Kreshnik*@TechnoSoft2022");


    }


}
