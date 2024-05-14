package day18.instructor;

import _utils.Driver;
import org.openqa.selenium.WebDriver;

public class _02_HeadlessBrowser {
    public static void main(String[] args) {
        //Headless driver

        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");


        driver.close();
    }

    //Class Task 2
}
