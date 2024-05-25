package day_23.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class _05_ClassTask_Solved {

    /**
     * US401: Verify new user added to the staging table can be erased
     * URL: https://selenium-practice-app.herokuapp.com/?#/usermgt
     * 1. Using fillOutRegistrationForm() method created in _02_ClassTask add a user to staging table
     * 2. Click "Clear table" button
     * 3. Verify no user is displayed on the table
     * NOTE: test all 3 roles (should have 3 tests in total for US401)
     */
    @Test(testName = "US401: Verify new user added to the staging table can be erased")
    public void test01(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/usermgt");

        _04_ClassTask_Solved task4 = new _04_ClassTask_Solved();
        task4.fillOutRegistrationForm(
                "John",
                "Smith",
                "123-456-7890",
                "johnsmith@test.com",
                "Instructor"
        );

        driver.findElement(By.id("clear-btn")).click();
        //driver.findElement(By.xpath("//tbody/tr")) vs driver.findElementd(By.xpath("//tbody/tr"))
        List<WebElement> list = driver.findElements(By.xpath("//tbody/tr"));

        Assert.assertEquals(list.size(), 0);
        Driver.closeDriver();
    }



    /**
     * US402: Verify new user is added to the database
     * URL: https://selenium-practice-app.herokuapp.com/?#/usermgt
     * 1. Add a user to stating table
     * 2. Click "Submit table" button
     * 3. Click "Access DB" button to open database page
     * 4. Verify newly added user in staging table is now added to the database
     * NOTE: test all 3 roles (should have 3 tests in total for US402
     */
    @Test(testName = "US402: Verify new user is added to the database")
    public void test02(){
        WebDriver driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://selenium-practice-app.herokuapp.com/?#/usermgt");

        _04_ClassTask_Solved task4 = new _04_ClassTask_Solved();
        task4.fillOutRegistrationForm(
                "John",
                "Smith",
                "123-456-7890",
                "johnsmith@test.com",
                "Instructor"
        );

        driver.findElement(By.id("submit-table-btn")).click();
        driver.findElement(By.linkText("Access DB")).click();

        Set<String> windows = driver.getWindowHandles();
        String currentWindow = driver.getWindowHandle();
        for(String each: windows){
            if (!each.equalsIgnoreCase(currentWindow))
                driver.switchTo().window(each);
        }

        Assert.assertTrue(driver.findElement(By.xpath("//td[text()='johnsmith@test.com']")).isDisplayed());
        Driver.quitDriver();
    }

}
