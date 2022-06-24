package Class5;

import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework3 {

    // Due date: Fri (Apr 29)

    /**
     * TC-1:  darksky.net
     * Verify correct temperature value is displayed after changing temperature units
     */

    /**
     * TC-2: facebook.com
     * Verify current date is selected in the dropdown when user lands on the Create new account form
     */

    /**
     * TC-3: https://classroomessentialsonline.com/
     * Verify user lands on Economy Church Chairs page after clicking the option from Church Chairs
     */

    @Test
    public void verifyChangeTempValue (){

        MyDriver.launchUrlOnNewWindow("https://darksky.net/");

        MyDriver.getDriver().manage().window().maximize();

        String arrowLocatorXpath = "//body/div[@id='header']/div[1]/div[1]/div[2]/b[1]";
        By arrowLocatorByXpath = By.xpath(arrowLocatorXpath);
        WebElement arrowLocator = MyDriver.getDriver().findElement(arrowLocatorByXpath);
        arrowLocator.click();

        String changeToCTempKmhXpath = "//body/div[@id='header']/div[1]/div[1]/div[3]/div[1]/ul[1]/li[3]";
        By changeToCTempKmhByXpath = By.xpath(changeToCTempKmhXpath);
        WebElement changeToCTempKmh = MyDriver.getDriver().findElement(changeToCTempKmhByXpath);
        changeToCTempKmh.click();

        String verifyTempValueContains = "//span[@class='desc swap']";
        By verifyTempValueByText = By.xpath(verifyTempValueContains);
        WebElement verifyTempValue = MyDriver.getDriver().findElement(verifyTempValueByText);
        verifyTempValue.isEnabled();


    }


    @Test
    public void verifyCurrentDateIsSelected () {

        MyDriver.launchUrlOnNewWindow("https://www.facebook.com/");

        By createNewAccountLocator = By.partialLinkText("Create new account");
        WebElement createNewAccBtn = MyDriver.getDriver().findElement(createNewAccountLocator);

        createNewAccBtn.click();
    }
}
