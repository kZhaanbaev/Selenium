package day09.student;

import _utils.Driver;
import org.openqa.selenium.WebDriver;

public class _03_ClassTask {
    public static void main(String[] args) {
        /**
         * Task: print out text of all links that has href attribute value starting with "https"
         */
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/home");

        //your code goes here:

    }
}
