package day01.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask1_Solved {
    /**
     * Set up WebDriver object
     *
     * Open https://amazon.com
     * Apply 2 seconds wait
     * Print out following:
     *      Title
     *      URL
     *      Length of the URL
     *
     * Open https://tesla.com
     * Apply 2 seconds wait
     * Print out following:
     *      Title
     *      URL
     *      Length of the URL
     * Close the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");

        Thread.sleep(2000);

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl().length());

        driver.get("https://tesla.com");

        Thread.sleep(2000);

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl().length());

        driver.close();
    }

}
