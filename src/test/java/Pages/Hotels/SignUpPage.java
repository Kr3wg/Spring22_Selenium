package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;

import java.util.Set;

public class SignUpPage extends Commands {

    By emailAddressBoxLocator = By.xpath("//input[@id='signupFormEmailInput']");
    By firstNameBoxLocator = By.xpath("//input[@id='signupFormFirstNameInput']");
    By lastNameBoxLocator = By.xpath("//input[@id='signupFormLastNameInput']");
    By passwordBoxLocator = By.xpath("//input[@id='signupFormPasswordInput']");
    By termsAndConditionsLinkLocator = By.xpath("//a[contains(text(),'Terms and Conditions')]");
    By privacyStatementsLinkLocator = By.xpath("//a[contains(text(),'Privacy Statement')]");
    By errorMessageForEmailBoxLocator = By.xpath("//div[@id='signupFormEmailInput-error']");
    By errorMessageForFirstNameBoxLocator = By.xpath("//div[@id='signupFormFirstNameInput-error']");
    By errorMessageForLastNameBoxLocator = By.xpath("//div[@id='signupFormLastNameInput-error']");
    By keepMeSignedInCheckBoxLocator = By.xpath("//input[@id='signUpFormRememberMeCheck']");
    By keepMeSignedInTextLocator = By.xpath("//label[contains(text(),'Keep me signed in')]");
    By continueButtonLocator = By.xpath("//button[@id='signupFormSubmitButton']");






    public void clickEmailAddressBox (){
        clickIt(emailAddressBoxLocator);
        Misc.pause(5);
    }

    public void typeEmailAddressSUP (String emailAddress){
        type(emailAddressBoxLocator,emailAddress);}

    public void typeFirstNameSUP (String firstName){
        type(firstNameBoxLocator,firstName);}

    public void typeLastNameSUP (String lastName){
        type(lastNameBoxLocator,lastName);
    }

    public void typePasswordSUP (String password){
        type(passwordBoxLocator,password);
    }


    public boolean isErrorMessageDisplayedUnderEmailBox (){
        return
                isElementDisplayed(errorMessageForEmailBoxLocator);}

    public boolean isErrorMessageDisplayedUnderFirstNameBox(){
        return
                isElementDisplayed(errorMessageForFirstNameBoxLocator);
    }

    public boolean isErrorMessageDisplayedUnderLastNameBox(){
        return
                isElementDisplayed(errorMessageForLastNameBoxLocator);
    }

    public boolean isKeepMeSignedInBoxEnabled (){
        return
                isElementEnabled(keepMeSignedInCheckBoxLocator);
    }

    public boolean isKeepMeSignedInTextDisplayed (){
        return
                isElementDisplayed(keepMeSignedInTextLocator);
    }

    public boolean isContinueButtonDisplayed (){
        return
               isElementDisplayed(continueButtonLocator);
    }

    public boolean isContinueButtonEnabled (){
        return
                isElementEnabled(continueButtonLocator);
    }



    public void clickTermsAndConditionsLink (){clickIt(termsAndConditionsLinkLocator);}

    public void clickPrivacyStatementsLink (){clickIt(privacyStatementsLinkLocator);}

    public String verifyTCPInNewT() {

        String currentWindowHandle = MyDriver.getDriver().getWindowHandle();
        Set<String> allWindows = MyDriver.getDriver().getWindowHandles();
        String currentTitle = null;
        for (String window : allWindows) {
            if (!currentWindowHandle.equalsIgnoreCase(window)) {
                MyDriver.getDriver().switchTo().window(window);
                currentTitle = MyDriver.getDriver().getTitle();
                Misc.pause(2);
                MyDriver.getDriver().close();
                MyDriver.getDriver().switchTo().window(currentWindowHandle);
            }
        }
        return currentTitle;
    }

    public String verifyPrivacyStatementInNewTab () {

        String currentWindowHandle = MyDriver.getDriver().getWindowHandle();
        Set<String> allWindow = MyDriver.getDriver().getWindowHandles();
        String Title = null;
        for (String windows : allWindow) {
            if (!currentWindowHandle.equalsIgnoreCase(windows)) {
                MyDriver.getDriver().switchTo().window(windows);
                Title = MyDriver.getDriver().findElement(privacyStatementsLinkLocator).getText();
                Misc.pause(2);
                MyDriver.getDriver().close();
                MyDriver.getDriver().switchTo().window(currentWindowHandle);
            }
        }
        return Title;
    }


    public void enterEmail (String email){
        type(emailAddressBoxLocator,email);
        Misc.pause(1);
    }















}
