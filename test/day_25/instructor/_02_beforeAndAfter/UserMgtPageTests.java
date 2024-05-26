package day_25.instructor._02_beforeAndAfter;

import _utils.Driver;
import day_23.instructor._04_ClassTask_Solved;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class UserMgtPageTests {
    WebDriver driver = null;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://selenium-practice-app.herokuapp.com/?#/usermgt");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        Driver.quitDriver();
    }

    @Test(testName = "US301: Verify Mentor registration")
    public void test01(){
        driver.findElement(By.id("Firstname")).sendKeys("John");
        driver.findElement(By.id("Lastname")).sendKeys("Smith");
        driver.findElement(By.id("Phonenumber")).sendKeys("123-456-7890");
        driver.findElement(By.id("Email")).sendKeys("john-smith@test.com");

        new Select(driver.findElement(By.id("Select-role"))).selectByVisibleText("Mentor");
        driver.findElement(By.id("submit-btn")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//tbody/tr")).isDisplayed());
    }

    @Test(testName = "US401: Verify new user added to the staging table can be erased")
    public void test02(){
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
    }

    @Test(testName = "US402: Verify new user is added to the database")
    public void test03(){
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
    }

    //Class Task 01
}
