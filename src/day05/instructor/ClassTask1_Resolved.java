package day05.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask1_Resolved {
    /**
     * 1. Open url https://computer-database.gatling.io/computers
     * 2. Input "Macbook Pro" in Search box
     * 3. Print out "Macbook Pro" name from the search result using linkText
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.close();
    }

}
