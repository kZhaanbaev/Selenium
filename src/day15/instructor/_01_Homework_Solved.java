package day15.instructor;

import _utils.Driver;
import org.openqa.selenium.WebDriver;

public class _01_Homework_Solved {
    /**
     * 	Print out age + emails if age of the person is between 40 and 50 (from all 10 pages)
     */
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/tables");


    }
}
