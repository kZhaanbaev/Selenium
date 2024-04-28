package day10.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //immediate children


        //descendant


        //following -> all following webElements regardless the hierarchy, by giving the starting point


        //preceding -> all preceding webElements regardless the hierarchy, by giving the starting point


        //preceding-sibling


        //following-sibling


        //parent


        //ancestor


        driver.close();

        //NOTE: ClassTask2

    }
}
