package day_21.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_ClassTaskTest_Review {
    /**
     * - Open https://selenium-practice-app.herokuapp.com/?#/home
     * - Navigate to Inputs page
     * - Enter message in Single Input Field section
     * - Verify entered message is displayed next to "You entered:" field
     */
    @Test
    public void test01(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");
        driver.findElement(By.linkText("Inputs")).click();
        driver.findElement(By.id("message")).sendKeys("Test Message");
        driver.findElement(By.name("button1")).click();
        Assert.assertEquals(driver.findElement(By.name("message1")).getText(), "Test Message");
        driver.close();
    }


    /**
     * - Open https://selenium-practice-app.herokuapp.com/?#/home
     * - Navigate to Inputs page
     * - Input number a and b
     * - Verify Total is correct
     */
    @Test
    public void test02(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");
        driver.findElement(By.linkText("Inputs")).click();
        driver.findElement(By.id("a")).sendKeys("2");
        driver.findElement(By.id("b")).sendKeys("4");
        driver.findElement(By.name("button2")).click();
        Assert.assertEquals(driver.findElement(By.name("answer2")).getText(), "6");
        driver.close();
    }

}
