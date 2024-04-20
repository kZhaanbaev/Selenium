package day05.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_CssLocatorById {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/");

        //By id in css selector => print title of the page


        //1. tag + id(#) => print title of the page


        //2. tag + [id=value] => print title of the page


        driver.close();

        //Note: ClassTask1
    }
}
