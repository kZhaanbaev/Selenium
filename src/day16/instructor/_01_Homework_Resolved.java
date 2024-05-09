package day16.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class _01_Homework_Resolved {
    /**
     * 		a. Open practice website -> iframes section
     * 		b. In Budget Tracker website:
     * 			i. add one transaction
     * 				your name + some numbers
     * 			ii. capture Total Amount
     * 		c. In Shared Note website input captured data
     * 			a. Title - your name
     * 			b. Note section:
     * 				1. Transaction - Amount
     * 			c. Click save
     * 			d. Find newly entered note in left column and click on it
     *          e. Verify if Title on right section is your name and print out the text
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/iframes");




        driver.close();
    }
}
