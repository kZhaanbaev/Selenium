package day18.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class _02_Synchronization {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        //implicit wait goes here
        driver.get("https://selenium-practice-app.herokuapp.com/?#/synchronization");

        //IMPLICITLY wait


        //EXPLICIT waits
        //1. wait for element to be present (Text display section)


        //2. wait for the alert to be displayed and then print out the text (Alert section)


        Thread.sleep(3000);
        driver.close();
    }

    //Class Task 3
}
