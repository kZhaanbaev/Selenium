package day_23.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_ClassTask_Solved {
    //NOTE: Write a Test for each of the scenarios below


    /**
     * US201: Verify sum of numbers
     * 1. Navigate to https://selenium-practice-app.herokuapp.com/?#/inputs
     * 2. Enter "5" in number a field
     * 3. Enter "18" in number b field
     * 3. Click 'Get Total'
     * 4. Verify sum is "23"
     */
    @Test(testName = "US201: Verify sum of numbers")
    public void test01(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/inputs");
        driver.findElement(By.id("a")).sendKeys("5");
        driver.findElement(By.id("b")).sendKeys("18");
        driver.findElement(By.name("button2")).click();
        Assert.assertEquals(driver.findElement(By.name("answer2")).getText(), "23");
        Driver.closeDriver();
    }

    /**
     * US202: Verify sum of numbers
     * 1. Navigate to https://selenium-practice-app.herokuapp.com/?#/inputs
     * 2. Enter "5" in number a field
     * 3. Enter "34" in number b field
     * 3. Click 'Get Total'
     * 4. Verify sum is "23"
     */
    @Test(testName = "US201: Verify sum of numbers")
    public void test02(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/inputs");
        driver.findElement(By.id("a")).sendKeys("5");
        driver.findElement(By.id("b")).sendKeys("34");
        driver.findElement(By.name("button2")).click();
        Assert.assertEquals(driver.findElement(By.name("answer2")).getText(), "39");
        Driver.closeDriver();
    }

    /**
     * US203: Verify sum of numbers
     * 1. Navigate to https://selenium-practice-app.herokuapp.com/?#/inputs
     * 2. Enter "50" in number a field
     * 3. Enter "18" in number b field
     * 3. Click 'Get Total'
     * 4. Verify sum is "23"
     */
    @Test(testName = "US201: Verify sum of numbers")
    public void test03(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/inputs");
        driver.findElement(By.id("a")).sendKeys("50");
        driver.findElement(By.id("b")).sendKeys("18");
        driver.findElement(By.name("button2")).click();
        Assert.assertEquals(driver.findElement(By.name("answer2")).getText(), "68");
        Driver.closeDriver();
    }

}
