package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

public class SignInPage extends Commands {




    By emailBoxLocator = By.xpath(" //input[@id='loginFormEmailInput']");
    By passwordLocator = By.xpath("//input[@id='loginFormPasswordInput']");
    By signInButtonLocator = By.xpath("//button[@id='loginFormSubmitButton']");
    By errorMessageLocator = By.xpath("//h3[contains(text(),'Email and password')]");










    public void typeEmailAddress (String emailAddress){
      type(emailBoxLocator , emailAddress);}

    public void typePassword (String password){
        type(passwordLocator, password);}

    public void clickSignIndBTonSInP (){
        clickIt(signInButtonLocator);
        Misc.pause(8);
    }

    public boolean isErrorMessageDisplayed (){
       return
        isElementDisplayed(errorMessageLocator);
    }

}
