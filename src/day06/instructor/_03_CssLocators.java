package day06.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_CssLocators {
    /**
     * 1. tag + class + attribute (chaining)
     * 2. sub-string matches:
     *      a. starts-with
     *      b. ends-with
     *      c. contains
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/#/home");

        //------ chaining = using multiple attributes -------


        //------ sub-strings work with values of the attributes only ------
        //sub-string starts-with


        //NOTE: ClassTask2


        //------ sub-string ends-with ----------

        //Note: ClassTask3


        //------ sub-string contains -----------

        //NOTE: ClassTask4


        driver.close();

    }
}
