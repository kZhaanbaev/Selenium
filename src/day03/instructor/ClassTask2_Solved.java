package day03.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask2_Solved {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 1. Input number a and number b
         * 2. Click Get Total button
         * 3. Verify if sum of 2 numbers are as expected
         */

        //Code 2 goes here...
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.close();
    }
}
