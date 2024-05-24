package day_23.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _01_ClassTask_Solved {
    //NOTE: Write a Test for each of the scenarios below


    /**
     * US101: Verify Input message
     * 1. Navigate to https://selenium-practice-app.herokuapp.com/?#/inputs
     * 2. Enter a message "Java is hard"
     * 3. Click 'Show message'
     * 4. Verify message is displayed
     */
    @Test(testName = "US101: Verify Input message")
    public void test01(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/inputs");
        driver.findElement(By.id("message")).sendKeys("Java is hard");
        driver.findElement(By.name("button1")).click();
        Assert.assertEquals(driver.findElement(By.name("message1")).getText(), "Java is hard");
        Driver.closeDriver();
    }

    /**
     * US102: Verify Input message
     * 1. Navigate to https://selenium-practice-app.herokuapp.com/?#/inputs
     * 2. Enter a message "It's possible to get better in Java"
     * 3. Click 'Show message'
     * 4. Verify message is displayed
     */
    @Test(testName = "US101: Verify Input message")
    public void test02(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/inputs");
        driver.findElement(By.id("message")).sendKeys("It's possible to get better in Java");
        driver.findElement(By.name("button1")).click();
        Assert.assertEquals(driver.findElement(By.name("message1")).getText(), "It's possible to get better in Java");
        Driver.closeDriver();
    }

    /**
     * US103: Verify Input message
     * 1. Navigate to https://selenium-practice-app.herokuapp.com/?#/inputs
     * 2. Enter a message "I have to try harder to get better"
     * 3. Click 'Show message'
     * 4. Verify message is displayed
     */
    @Test(testName = "US101: Verify Input message")
    public void test03(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/inputs");
        driver.findElement(By.id("message")).sendKeys("I have to try harder to get better");
        driver.findElement(By.name("button1")).click();
        Assert.assertEquals(driver.findElement(By.name("message1")).getText(), "I have to try harder to get better");
        Driver.closeDriver();
    }


}
