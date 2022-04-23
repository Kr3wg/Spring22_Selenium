import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class1 {




    @Test
    public void openAmazon (){

        System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");


    }
}
