package day_20.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_DemoTest {
    /**
     *  Test 101
     *  - Navigate to google.com
     *  - Verify title of the page is "Google"
     */
    @Test
    public void test01(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://google.com");
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.close();
    }


    /**
     * Test 102
     * - Navigate to google.com
     * - Verify following navigation buttons are present:
     *      About, Store, Gmail, Images
     */
    @Test
    public void test02(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://google.com");
        Assert.assertTrue(driver.findElement(By.linkText("About")).isEnabled());
        Assert.assertTrue(driver.findElement(By.linkText("Store")).isEnabled());
        Assert.assertTrue(driver.findElement(By.linkText("Gmail")).isEnabled());
        Assert.assertTrue(driver.findElement(By.linkText("Images")).isEnabled());

        driver.close();
    }


    /**
     * Test 103
     * - Navigate to google.com
     * - Input "Selenium" in the search bar
     * - Verify url is changed
     */
    @Test
    public void test03(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://google.com");
        String currentURL = driver.getCurrentUrl();

        driver.findElement(By.xpath("//textarea")).sendKeys("Selenium");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("btnK"))));

        driver.findElement(By.name("btnK")).click();

        String newURL = driver.getCurrentUrl();

        Assert.assertNotEquals(newURL, currentURL);

        driver.close();
    }


}
