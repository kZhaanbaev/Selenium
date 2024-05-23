package day_23.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Set;

public class _00_Review {
    /*
      NOTE: Use dataProvider

      US1003: Verify all text links on homepage are opening on new window.
     */

    @DataProvider(name = "links")
    public Object[] linksData() {
        Object[] arr = {
                "PHP Travels",
                "Mercury tours",
                "Internet",
                "E-commerce",
                "Passion Tea Company",
                "Saucedemo",
                "Shopping Cart"
        };
        return arr;
    }

    @Test(testName = "Verify links opening in on a new page", dataProvider = "links")
    public void test01(String oneLink){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");
        driver.findElement(By.linkText(oneLink)).click();

//        Set<String> set = driver.getWindowHandles();
//        Assert.assertEquals(set.size(), 2);

        Assert.assertEquals(driver.getWindowHandles().size(), 2);
        Driver.quitDriver();
    }
}
