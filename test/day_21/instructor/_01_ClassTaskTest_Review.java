package day_21.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.List;

public class _01_ClassTaskTest_Review {
    /**
     * Test 201:
     * - Navigate to https://selenium-practice-app.herokuapp.com/?#/home
     * - Verify title of the page is "TLA Automation"
     */
    @Test(testName = "Title test", description = "Verify title of the page is \"TLA Automation\"",
    priority = 1)
    public void test01(Method method){
        Test test = method.getAnnotation(Test.class);
        System.out.println(test.description());

        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");
        Assert.assertEquals(driver.getTitle(), "TLA Automation");
        Driver.closeDriver();
    }


    /**
     * Test 202:
     * - Navigate to https://selenium-practice-app.herokuapp.com/?#/home
     * - Verify there are 18 navigation buttons
     */
    @Test(testName = "Nav buttons test")
    public void test02(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");

        List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@class, 'navbar-brand')]"));
        Assert.assertEquals(elements.size(), 18);

        Driver.closeDriver();
    }


    /**
     * - Navigate to https://selenium-practice-app.herokuapp.com/?#/home
     * - Verify footer of the page contains text "Tech Lead Academy"
     */
    @Test(testName = "Footer text test", enabled = false)
    public void test03(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");

        Assert.assertTrue(driver.findElement(By.id("copyright")).getText().contains("Tech Lead Academy"));

        Driver.closeDriver();
    }


    /**
     * Test 204:
     * - Navigate to https://selenium-practice-app.herokuapp.com/?#/home
     * - Verify following links are present on the page:
     *      PHP Travels
     *      Mercury tours
     *      Internet
     *      E-commerce
     *      Passion Tea Company
     *      Saucedemo
     *      Shopping Cart
     */
    @Test(testName = "External Links test", priority = -1)
    public void test04(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");

        Assert.assertTrue(driver.findElement(By.linkText("PHP Travels")).isEnabled());
        Assert.assertTrue(driver.findElement(By.linkText("Mercury tours")).isEnabled());
        Assert.assertTrue(driver.findElement(By.linkText("Internet")).isEnabled());
        Assert.assertTrue(driver.findElement(By.linkText("E-commerce")).isEnabled());
        Assert.assertTrue(driver.findElement(By.linkText("Passion Tea Company")).isEnabled());
        Assert.assertTrue(driver.findElement(By.linkText("Saucedemo")).isEnabled());
        Assert.assertTrue(driver.findElement(By.linkText("Shopping Cart")).isEnabled());

        Driver.closeDriver();
    }


}
