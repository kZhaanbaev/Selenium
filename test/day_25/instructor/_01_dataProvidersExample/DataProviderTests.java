package day_25.instructor._01_dataProvidersExample;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DataProviderTests {
    @Test(testName = "US101: Verify Input message", dataProvider = "inputText", dataProviderClass = DataProviders.class)
    public void test01(String text){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/inputs");
        driver.findElement(By.id("message")).sendKeys(text);
        driver.findElement(By.name("button1")).click();
        Assert.assertEquals(driver.findElement(By.name("message1")).getText(), text);
        Driver.closeDriver();
    }

    @Test(testName = "US301: Verify Instructor registration", dataProvider = "details", dataProviderClass = DataProviders.class)
    public void test02(String first, String last, String phone, String email, String role){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/usermgt");
        driver.findElement(By.id("Firstname")).sendKeys(first);
        driver.findElement(By.id("Lastname")).sendKeys(last);
        driver.findElement(By.id("Phonenumber")).sendKeys(phone);
        driver.findElement(By.id("Email")).sendKeys(email);

        new Select(driver.findElement(By.id("Select-role"))).selectByVisibleText(role);
        driver.findElement(By.id("submit-btn")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//tbody/tr")).isDisplayed());
        Driver.closeDriver();
    }

    @Test(testName = "Login Test", dataProvider = "data", dataProviderClass = DataProviders.class)
    public void test03(String first, String last, String email, String password, String role) {
        WebDriver driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://selenium-practice-app.herokuapp.com/?#/usermgt");
        driver.findElement(By.linkText("LOGIN")).click();

        Set<String> windows = driver.getWindowHandles();
        for (String each: windows){
            if (!each.equals(driver.getWindowHandle()))
                driver.switchTo().window(each);
        }

        driver.findElement(By.name("username")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.tagName("button")).click();

        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), role + " Portal");
        Assert.assertEquals(driver.findElement(By.tagName("h4")).getText(),
                "Welcome, " + first + " " + last.charAt(0));

        Driver.quitDriver();
    }
}
