package day04.instructor;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassTask2_Solved {
    public static void main(String[] args) {
        /**
         * Task:
         * 1. Print out all links' text on the bottom of the home page of automation practice website.
         * 2. Print out "Saucedemo" link's text only from the list
         */

        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/#/home");

        List<WebElement> list = driver.findElements(By.className("link"));

        //1
        for (WebElement eachItem: list){
            System.out.println(eachItem.getText());
        }

        //2
        System.out.println(list.get(5).getText());

        driver.close();

    }
}
