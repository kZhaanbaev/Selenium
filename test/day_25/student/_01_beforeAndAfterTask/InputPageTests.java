package day_25.student._01_beforeAndAfterTask;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputPageTests {
    /**
     * Add BeforeMethod and AfterMethod annotations to this class and move common code used in
     * the following Tests in.
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

    @Test(testName = "US201: Verify sum of numbers")
    public void test02(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/inputs");
        driver.findElement(By.id("a")).sendKeys("5");
        driver.findElement(By.id("b")).sendKeys("18");
        driver.findElement(By.name("button2")).click();
        Assert.assertEquals(driver.findElement(By.name("answer2")).getText(), "23");
        Driver.closeDriver();
    }


}
