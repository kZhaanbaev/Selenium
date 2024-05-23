package day_22.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _03_DataProviders {

    /*
    Data Providers with 2 parameters
    Example 2: Verify following navigation buttons takes to correct URL
    (url should end with button name)
    Home, Notes, Alert, Tables, Calendar, Files, Others
     */

    @DataProvider(name = "nav buttons")
    public Object[][] data(){
        Object[][] arr = new Object[4][2];
        arr[0][0] = "Home";
        arr[0][1] = "https://selenium-practice-app.herokuapp.com/?#/home";
        arr[1][0] = "Alert";
        arr[1][1] = "https://selenium-practice-app.herokuapp.com/?#/alert";
        arr[2][0] = "Calendar";
        arr[2][1] = "https://selenium-practice-app.herokuapp.com/?#/calendar";
        arr[3][0] = "Others";
        arr[3][1] = "https://selenium-practice-app.herokuapp.com/?#/others";
        return arr;
    }
    @Test(testName = "Nav button test", dataProvider = "nav buttons")
    public void test01(String linkName, String URL){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");
        driver.findElement(By.linkText(linkName)).click();
        Assert.assertEquals(driver.getCurrentUrl(), URL);

        //driver.getWindowHandles();
        Driver.quitDriver();
    }


    //ClassTask 2


}
