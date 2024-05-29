package day_26.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

        driver.findElement(By.xpath("//a[@title='Accounts']/parent::one-app-nav-bar-item-root")).click();
        //one-app-nav-bar-item-root[@data-id='Account']

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
    @Test(testName = "US2602: Verify Accounts - All Accounts")
    public void test02(){
        WebDriver driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://techleadacademy-dev-ed.develop.lightning.force.com/lightning/page/home");
        driver.findElement(By.id("username")).sendKeys("test@techleadacademy.sandbox");
        driver.findElement(By.id("password")).sendKeys("tech-lead1!");
        driver.findElement(By.id("Login")).click();

        //clicking Account button
        driver.findElement(By.xpath("//a[@title='Accounts']/parent::one-app-nav-bar-item-root")).click();

        //clicking menu button of Accounts
        driver.findElement(By.xpath("//button[@title='Select a List View: Accounts']")).click();

        //clicking All Accounts option
        driver.findElement(By.xpath("//a/span[text()='All Accounts']")).click();

        //waiting for the number of locators to be more than 5
        Driver.waitNumberOfElementsToBeMoreThan(By.xpath("//tbody/tr"), 5);

        //this is same as above code
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//tbody/tr"), 5));

        List<WebElement> list = driver.findElements(By.xpath("//tbody/tr"));
        Assert.assertTrue(list.size() > 5);

        Driver.closeDriver();
    }

    /**
     * US2603: Verify Account page
     * 1. Navigate to https://techleadacademy-dev-ed.develop.lightning.force.com/lightning/page/home
     * 2. Input username: test@techleadacademy.sandbox
     * 3. Input password: tech-lead1!
     * 4. Click Accounts page button
     * 5. Click on any Account item
     * 6. Verify title of the page contains name of the Account
     */
    @Test(testName = "US2603: Verify Account page")
    public void test03(){
        WebDriver driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://techleadacademy-dev-ed.develop.lightning.force.com/lightning/page/home");
        driver.findElement(By.id("username")).sendKeys("test@techleadacademy.sandbox");
        driver.findElement(By.id("password")).sendKeys("tech-lead1!");
        driver.findElement(By.id("Login")).click();

        driver.findElement(By.xpath("//a[@title='Accounts']/parent::one-app-nav-bar-item-root")).click();

        List<WebElement> list = driver.findElements(By.xpath("//tbody/tr//a"));
        list.get(0).click();

        String expectedText = driver.findElement(By.xpath("//h1//lightning-formatted-text")).getText();
        //lightning-formatted-text/parent::div[starts-with(@class, 'testonly')]

        Assert.assertTrue(driver.getTitle().contains(expectedText));

        Driver.closeDriver();
    }


}
