package day02.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//NOTE: Refer to README.md first
public class _02_BasicLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/#/home");

        //locate by id


        //locate by name


        //locate by className


        //locate by tagName


        //locate by linkText


        //locate by partialLinkText
        //NOTE: It is case sensitive


        //locating by attribute
        //Example 1:


        //Example 2:


        driver.close();

        //NOTE: ClassTask2 after competing of this demo

    }
}
