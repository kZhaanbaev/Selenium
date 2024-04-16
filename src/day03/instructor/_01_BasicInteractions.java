package day03.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_BasicInteractions {
    public static void main(String[] args) {
        /**
         * 1. Open google page
         * 2. Input "selenium" keyword in searchbar
         * 3. Click Search button
         * 4. Get value of href attribute of Wikipedia linkText of search result mini window
         *  4.1 Verify expected vs actual
         * 5. Print out header of the first item from the search result
         *  5.1 Verify if word contains a word "selenium"
         * 6. Verify if button "Shopping" is there. (is enabled)
         * 7. Verify if google logo on top left of the page is displayed
         */

        //Set up the driver
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.close();
    }
}
