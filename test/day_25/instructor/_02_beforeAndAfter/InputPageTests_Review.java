package day_25.instructor._02_beforeAndAfter;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InputPageTests_Review {
    /**
     * Add BeforeMethod and AfterMethod annotations to this class and move common code used in
     * the following Tests in.
     */
    WebDriver driver = null;

    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/inputs");
    }

    @AfterMethod
    public void closeDriver(){
        Driver.closeDriver();
    }

    @Test(testName = "US101: Verify Input message")
    public void test01(){
        driver.findElement(By.id("message")).sendKeys("Java is hard");
        driver.findElement(By.name("button1")).click();
        Assert.assertEquals(driver.findElement(By.name("message1")).getText(), "Java is hard");
    }

    @Test(testName = "US201: Verify sum of numbers")
    public void test02(){
        driver.findElement(By.id("a")).sendKeys("5");
        driver.findElement(By.id("b")).sendKeys("18");
        driver.findElement(By.name("button2")).click();
        Assert.assertEquals(driver.findElement(By.name("answer2")).getText(), "23");
    }


}
