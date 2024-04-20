package day05.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask3_Resolved {
    /**
     * 1. Open https://demo.applitools.com/
     * 2. Input username and password using "placeholder" attributes to locate elements
     * 3. Click on Sign in button
     * 4. Verify name "Jack Gomez" is displayed
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.close();
    }
}
