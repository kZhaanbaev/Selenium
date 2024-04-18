package day04.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _03_FindElementsvsFindElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/home");

        //1. What is the difference between findElement() vs findElements()
        // Nav buttons on practice home page

        //2. Print specific item


        driver.close();

        //NOTE: ClassTask 2
    }
}
