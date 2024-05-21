package day_22.instructor;


import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProviders {

    /*
    ReadMe.md <<==
    Example: Open google.com and verify following buttons are enabled:
    Advertising, Business, How Search works, Privacy, Terms, Settings
     */

    //Step 1: without data Providers
//    @Test(testName = "DataProvider Test on Google page")
//    public void test01(){
//        WebDriver driver = Driver.getDriver();
//        driver.get("https://google.com");
//        Assert.assertTrue(driver.findElement(By.linkText("Advertising")).isEnabled());
//        Assert.assertTrue(driver.findElement(By.linkText("Business")).isEnabled());
//        Assert.assertTrue(driver.findElement(By.linkText("How Search works")).isEnabled());
//        Assert.assertTrue(driver.findElement(By.linkText("Privacy")).isEnabled());
//        Assert.assertTrue(driver.findElement(By.linkText("Terms")).isEnabled());
//        Assert.assertTrue(driver.findElement(By.linkText("Settings")).isEnabled());
//
//        Driver.closeDriver();
//    }

    @Test(testName = "DataProvider Test on Google page")
    public void test02(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://google.com");
        Assert.assertTrue(driver.findElement(By.linkText("Advertising")).isEnabled());

        Driver.closeDriver();
    }

    @Test(testName = "DataProvider Test on Google page")
    public void test03(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://google.com");
        Assert.assertTrue(driver.findElement(By.linkText("Business")).isEnabled());

        Driver.closeDriver();
    }

    @Test(testName = "DataProvider Test on Google page")
    public void test04(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://google.com");
        Assert.assertTrue(driver.findElement(By.linkText("Settings")).isEnabled());

        Driver.closeDriver();
    }


    @Test(testName = "DataProvider Test on Google page")
    public void test05(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://google.com");
        Assert.assertTrue(driver.findElement(By.linkText("Privacy")).isEnabled());

        Driver.closeDriver();
    }



    //Step 2: with data Providers

    @DataProvider(name = "data")
    public Object[] dataLinkTexts(){
        Object[] data = {
                "Advertising",
                "Business",
                "How Search works",
                "Privacy",
                "Terms",
                "Settings"};
        return data;
    }

    @Test(testName = "DataProvider Test on Google page", dataProvider = "data")
    public void test06(String linkName){
        WebDriver driver = Driver.getDriver();
        driver.get("https://google.com");
        Assert.assertTrue(driver.findElement(By.linkText(linkName)).isEnabled());

        Driver.closeDriver();
    }


    //ClassTask 1


}
