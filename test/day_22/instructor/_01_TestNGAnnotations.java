package day_22.instructor;


import _utils.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_TestNGAnnotations {
    /**
     6. "invocationCount" - Verify alert is getting displayed within 10 seconds on Synchronization page
     using WebDriverWait
     7. "invocationTimeOut" - Verify input text is getting displayed within 10 seconds on Synchronization page,
     substitute WebDriverWait (applies to all counts together as a whole)
     8. "timeOut" - Verify input text is getting displayed within 10 seconds on Synchronization page,
     substitute WebDriverWait (applies to specific test case, no count needed)
     9. "dataProvider"
     */

    @Test(testName = "Alert display test", invocationCount = 5, invocationTimeOut = 25000L)
    public void test01(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/synchronization");
        driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        Driver.closeDriver();
    }

    @Test(testName = "Timeout Test", timeOut = 5000L)
    public void test02(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/synchronization");
        driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();

        driver.findElement(By.id("input-text")).sendKeys("TEST");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.textToBe(By.id("text-display"), "TEST"));

        Assert.assertEquals(driver.findElement(By.id("text-display")).getText(),"TEST");

        Driver.closeDriver();
    }

    @Test(testName = "Expected Exception Test", expectedExceptions = {NoSuchElementException.class}, dependsOnMethods = "Timeout Test")
    public void test03(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/synchronization");

        driver.findElement(By.linkText("Admin")).click();

        Driver.closeDriver();
    }
}
