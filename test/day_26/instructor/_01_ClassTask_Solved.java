package day_26.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class _01_ClassTask_Solved {
    //NOTE: Write a Test for each of the scenarios below


    /**
     * US2601: Verify Accounts - Recent items
     * 1. Navigate to https://techleadacademy-dev-ed.develop.lightning.force.com/lightning/page/home
     * 2. Input username: test@techleadacademy.sandbox
     * 3. Input password: tech-lead1!
     * 4. Click Accounts page button
     * 5. Verify you can see at least 1 record
     */
    @Test(testName = "US2601: Verify Accounts - Recent items")
    public void test01(){
        WebDriver driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://techleadacademy-dev-ed.develop.lightning.force.com/lightning/page/home");
        driver.findElement(By.id("username")).sendKeys("test@techleadacademy.sandbox");
        driver.findElement(By.id("password")).sendKeys("tech-lead1!");
        driver.findElement(By.id("Login")).click();

        driver.findElement(By.xpath("//a[@title='Accounts']")).click();

        List<WebElement> list = driver.findElements(By.xpath("//tbody/tr"));
        Assert.assertTrue(list.size() > 1);

        Driver.closeDriver();
    }

    /**
     * US2602: Verify Accounts - All Accounts
     * 1. Navigate to https://techleadacademy-dev-ed.develop.lightning.force.com/lightning/page/home
     * 2. Input username: test@techleadacademy.sandbox
     * 3. Input password: tech-lead1!
     * 4. Click Accounts page button
     * 5. Verify you can see more than 5 records
     */

    /**
     * US2603: Verify Account page
     * 1. Navigate to https://techleadacademy-dev-ed.develop.lightning.force.com/lightning/page/home
     * 2. Input username: test@techleadacademy.sandbox
     * 3. Input password: tech-lead1!
     * 4. Click Accounts page button
     * 5. Click on any Account item
     * 6. Verify title of the page contains name of the Account
     */


}
