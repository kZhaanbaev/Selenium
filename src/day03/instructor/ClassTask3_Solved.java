package day03.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask3_Solved {
    public static void main(String[] args) {
        /**
         * 1. Fill out the form in "Contact Us Today!" section
         * 2. Verify message "Thanks for contacting us,
         * we will get back to you shortly." is displayed
         */

        //Code 3 goes here...
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.close();
    }
}
