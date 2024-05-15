package day18.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _02_HeadlessBrowser {
    public static void main(String[] args) {
        //Headless driver
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");

        System.out.println(driver.findElement(By.className("text")).getText());

        driver.findElement(By.linkText("Inputs")).click();

        System.out.println(driver.findElement(By.id("copyright")).getText());

        driver.close();
    }

    //Class Task 2
}
