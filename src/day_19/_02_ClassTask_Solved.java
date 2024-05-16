package day_19;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class _02_ClassTask_Solved {
    /**
     * Run the code Headless
     *  1. Navigate to https://selenium-practice-app.herokuapp.com/?#/others
     *  2. Click Toggle button
     *  3. Verify text of the button on the right changed
     *  from "Disabled button" to "Enabled button"
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://selenium-practice-app.herokuapp.com/?#/others");

        driver.findElement(By.id("toggle-btn")).click();
        Driver.sleep(1000);

        System.out.println(driver.findElement(By.id("btn-status")).getText());

        if (!driver.findElement(By.id("btn-status")).getText().toLowerCase().equals("enabled button")){
            System.out.println("Text did not match");
        }else {
            System.out.println("Text matched expected result");
        }

        driver.close();
    }
}
