package day_23.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_ClassTask_Solved {
    //NOTE: Write a Test for each of the scenarios below


    /**
     * US301: Verify Instructor registration
     * 1. Navigate to https://selenium-practice-app.herokuapp.com/?#/usermgt
     * 2. Fill out the form as an Instructor
     * 3. Click Submit
     * 4. Verify information is populated on the table below
     */
    @Test(testName = "US301: Verify Instructor registration")
    public void test01(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/usermgt");
        driver.findElement(By.id("Firstname")).sendKeys("John");
        driver.findElement(By.id("Lastname")).sendKeys("Smith");
        driver.findElement(By.id("Phonenumber")).sendKeys("123-456-7890");
        driver.findElement(By.id("Email")).sendKeys("john-smith@test.com");

//        Select select = new Select(driver.findElement(By.id("Select-role")));
//        select.selectByVisibleText("Instructor");

        new Select(driver.findElement(By.id("Select-role"))).selectByVisibleText("Instructor");
        driver.findElement(By.id("submit-btn")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//tbody/tr")).isDisplayed());
        Driver.closeDriver();
    }


    /**
     * US302: Verify Mentor registration
     * 1. Navigate to https://selenium-practice-app.herokuapp.com/?#/usermgt
     * 2. Fill out the form as a Mentor
     * 3. Click Submit
     * 4. Verify information is populated on the table below
     */
    @Test(testName = "US301: Verify Instructor registration")
    public void test02(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/usermgt");
        driver.findElement(By.id("Firstname")).sendKeys("John");
        driver.findElement(By.id("Lastname")).sendKeys("Smith");
        driver.findElement(By.id("Phonenumber")).sendKeys("123-456-7890");
        driver.findElement(By.id("Email")).sendKeys("john-smith@test.com");

        new Select(driver.findElement(By.id("Select-role"))).selectByVisibleText("Mentor");
        driver.findElement(By.id("submit-btn")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//tbody/tr")).isDisplayed());
        Driver.closeDriver();
    }


    /**
     * US303: Verify Student registration
     * 1. Navigate to https://selenium-practice-app.herokuapp.com/?#/usermgt
     * 2. Fill out the form as a Student
     * 3. Click Submit
     * 4. Verify information is populated on the table below
     */
    @Test(testName = "US301: Verify Instructor registration")
    public void test03(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/usermgt");
        driver.findElement(By.id("Firstname")).sendKeys("John");
        driver.findElement(By.id("Lastname")).sendKeys("Smith");
        driver.findElement(By.id("Phonenumber")).sendKeys("123-456-7890");
        driver.findElement(By.id("Email")).sendKeys("john-smith@test.com");

        new Select(driver.findElement(By.id("Select-role"))).selectByVisibleText("Student");
        driver.findElement(By.id("submit-btn")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//tbody/tr")).isDisplayed());
        Driver.closeDriver();
    }

}
