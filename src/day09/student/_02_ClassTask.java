package day09.student;

import _utils.Driver;
import org.openqa.selenium.WebDriver;

public class _02_ClassTask {
    public static void main(String[] args) {
        /**
         * Task: print out href value of saucedemo link on homepage using text() option of xpath
         * result: href="http://www.saucedemo.com/"
         */
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/home");

        //your code goes here:

    }
}
