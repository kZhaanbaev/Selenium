package day_21.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _01_ClassTaskTest_Review {
    /**
     * Test 201:
     * - Navigate to https://selenium-practice-app.herokuapp.com/?#/home
     * - Verify title of the page is "TLA Automation"
     */
    @Test
    public void test01(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");
        Assert.assertEquals(driver.getTitle(), "TLA Automation");
        driver.close();
    }


    /**
     * Test 202:
     * - Navigate to https://selenium-practice-app.herokuapp.com/?#/home
     * - Verify there are 18 navigation buttons
     */
    @Test
    public void test02(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");

        List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@class, 'navbar-brand')]"));
        Assert.assertEquals(elements.size(), 18);

        driver.close();
    }


    /**
     * - Navigate to https://selenium-practice-app.herokuapp.com/?#/home
     * - Verify footer of the page contains text "Tech Lead Academy"
     */
    @Test
    public void test03(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");

        Assert.assertTrue(driver.findElement(By.id("copyright")).getText().contains("Tech Lead Academy"));

        driver.close();
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
    @Test
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

        driver.close();
    }


}
