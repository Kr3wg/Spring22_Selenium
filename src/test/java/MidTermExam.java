import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MidTermExam {

    /**
     * Ques-2:
     * Verify feelsLike-temp value is in between the low-temp value and high-temp value
     * Web: https://www.darksky.net/
     * points: 20
     */



    @Test
    public void verifyTempSort (){

        MyDriver.launchUrlOnNewWindow("https://www.darksky.net/");

        MyDriver.getDriver().manage().window().maximize();


        String feelsLikeTemp = "//span[@class='feels-like-text']";
        By feelsLikeTempXpathLocByXpath = By.xpath(feelsLikeTemp);
        WebElement feelsLikeTempLocator = MyDriver.getDriver().findElement(feelsLikeTempXpathLocByXpath);


        String feelsLikeDisplayedF = feelsLikeTempLocator.getText();
        String feelsLikeDisplayedFDegRemoved = feelsLikeDisplayedF.substring(0,feelsLikeDisplayedF.length()-1);
        double feelsLikeTempVal = Integer.parseInt(feelsLikeDisplayedFDegRemoved);



        String lowTemp = "//span[@class='low-temp-text']";
        By lowTempXpathLocByXpath = By.xpath(lowTemp);
        WebElement lowTempLocator = MyDriver.getDriver().findElement(lowTempXpathLocByXpath);


        String lowTempDisplayedF = lowTempLocator.getText();
        String lowTempDisplayedFDegRemoved = lowTempDisplayedF.substring(0,lowTempDisplayedF.length()-1);
        double lowTempVal = Integer.parseInt(lowTempDisplayedFDegRemoved);


        String highTemp = "//span[@class='high-temp-text']";
        By highTempXpathLocByXpath = By.xpath(highTemp);
        WebElement highTempLocator = MyDriver.getDriver().findElement(highTempXpathLocByXpath);




        String highTempDisplayedF = highTempLocator.getText();
        String highTempDisplayedFDegRemoved = highTempDisplayedF.substring(0,highTempDisplayedF.length()-1);
        double highTempVal = Integer.parseInt(highTempDisplayedFDegRemoved);

        System.out.println("Feels Like Temp "+feelsLikeTempVal + "\n" +"Low Temp "+ lowTempVal + "\n" +"High Temp "+ highTempVal);

        if (feelsLikeTempVal < lowTempVal)
            System.out.println("Feels Like Temp is lower than Low Temp");
        else
            System.out.println("Feels Like Temp is not lower than Low Temp");

        if (feelsLikeTempVal > lowTempVal)
            System.out.println("Feels Like Temp is higher than Low Temp");
        else
            System.out.println("Feels Like Temp is not higher than Low Temp");

        if (feelsLikeTempVal == lowTempVal)
            System.out.println("Feels Like Temp is equal with Low Temp");
        else
            System.out.println("Feels Like Temp is not equal with Low Temp");


        if (feelsLikeTempVal > highTempVal)
            System.out.println("Feels Like Temp is higher than High Temp");
        else
            System.out.println("Feels Like Temp is not higher than High Temp");

        if (feelsLikeTempVal < highTempVal)
            System.out.println("Feels Like Temp is lower than High Temp");
        else
            System.out.println("Feels Like Temp is not lower than High Temp");

        if (feelsLikeTempVal == highTempVal)
            System.out.println("Feels Like Temp is equal with High Temp");
        else
            System.out.println("Feels Like Temp is not equal with High Temp");

        if (lowTempVal < highTempVal)
            System.out.println("Low Temp is lower than High Temp");
        else
            System.out.println("Low Temp is not lower than High Temp");

        if (lowTempVal > highTempVal)
            System.out.println("Low Temp is higher than High Temp");
        else
            System.out.println("Low Temp is not higher than High Temp");

        if (lowTempVal == highTempVal)
            System.out.println("Low Temp is equal with High Temp");
        else
            System.out.println("Low Temp is not equal with High Temp");

    }

        /**
         * Ques-2:
         * Create a method to return factorial value of input-int-value
         * points: 10
         */
        /*
         *
         * eg:
         * input -> 5
         * returned value -> (5*4*3*2*1) = 120
         *
         * input -> 1
         * returned value -> (1) = 1
         *
         * input -> 3
         * returned value -> (3*2*1) = 6
         *
         * input -> 10
         * returned value -> (10*9*8*7*6*5*4*3*2*1) =
         */
        public static void main(String[] args) {
            factorialValue(5);
            int[] num = {3, 5, 1, 4, 2, 7};
            missingSmallestPositiveInteger(num);
        }


        public static void factorialValue (int factInput){

        int numVal = factInput;

        int i = 1 , fact = 1 ;
        while (i <= numVal) {
            fact = fact * i ;
            i++;
        }
            System.out.println("The Factorial Value of the Given Number is " + fact);
    }





        /**
         * Ques-3:
         * Create a method to return the common Strings values in two input-String-arrays
         * points: 30
         * Note: two input-String-arrays can be of same size or different size
         */
        /*
         *
         * eg:
         * input -> {"happY", "king", "peace", "living standard"} , {"king kong", "Happy", "PEACE"}
         * returned value -> [happy, peace]
         *
         * input -> {“ab”, “abcd”, “abc”, “abcde”, “defg”, "koli”} , {“abcde”, “jhuy”, “plot”, “koli”}
         * returned value -> [abcde, koli]
         *
         */



    /**
     * Ques-4:
     * Create a method to return missing smallest positive integer (greater than 0) from given int-array.
     * points: 40
     */
    /*
     *
     * eg:
     * 	input -> : {3, 5, 1, 4, 2, 7}
     * 	returned value : 6
     *
     * 	input -> : {3, 5, 1, 4, 2}
     * 	returned value : 6
     *
     * 	input -> {2, 5, -1, 0, 6}
     * 	returned value : 1
     *
     * 	input -> {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
     * 	returned value : 4
     *
     * 	input -> {-2, -5, -1, -10, -6}
     * 	returned value : 1
     *
     */


    public static int missingSmallestPositiveInteger (int[] inputVal1){

        for (int i = 0 ; i < inputVal1.length ; i++){
            int minIndex = i ;
            for (int j = i + 1 ; j < inputVal1.length ; j++){
                if (inputVal1[minIndex] > inputVal1[j])
                    minIndex = j;
                }
            }
        int smallestMissingVal = 1 ;
        for (int i = 0 ; i < inputVal1.length ; i++ ){
            if ( inputVal1[i] == smallestMissingVal )
                smallestMissingVal++;
            else if (inputVal1[i] > smallestMissingVal)
                break;
        }
        return smallestMissingVal;
    }
}
