package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;

import java.util.Set;

public class SignUpPage extends Commands {

    By termsAndConditionsLinkLocator = By.xpath("//a[contains(text(),'Terms and Conditions')]");
    By privacyStatementsLinkLocator = By.xpath("//a[contains(text(),'Privacy Statement')]");




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














}
