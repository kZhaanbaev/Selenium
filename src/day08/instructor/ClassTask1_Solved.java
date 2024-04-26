package day08.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassTask1_Solved {
    /**
     * On "Selectors" page
     * Under "Simple Selectors" section
     * From the very first color row
     * Print out following text using css locators only:
     * - Red
     * - White
     * - Yellow
     */
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/#/selectors");

        //1 Red
        System.out.println(driver.findElement(By.cssSelector(".options > li:first-child")).getText());

        //1 White
        System.out.println(driver.findElement(By.cssSelector(".options > li:nth-child(3)")).getText());

        //1 Yellow
        System.out.println(driver.findElement(By.cssSelector(".options > li:last-child")).getText());
        driver.findElement(By.cssSelector(".options > li:last-child")).click();

        driver.close();
    }
}
