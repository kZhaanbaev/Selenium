package day04.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Review {
    /**
     * 1. Open https://www.udemy.com/
     * 2. Verify "Log in" button is displayed and clickable.
     * 3. Verify title of the page is "Online Courses - Learn Anything, On Your Schedule | Udemy".
     * 4. Verify url of the home page starts with "https" to make sure it's secured.
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();



        driver.close();

    }
}
