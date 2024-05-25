package day_23.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _07_ClassTask_Solved {
    /**
     * 1. Copy all 3 Tests from the _03_ClassTask and paste it here
     * 2. Combine all 3 Tests in 1, using dataProviders
     */

    @DataProvider(name = "details")
    public Object[][] data(){
        Object[][] arr = new Object[3][5];
        arr[0][0] = "John";
        arr[0][1] = "Smith";
        arr[0][2] = "123-456-7890";
        arr[0][3] = "john-smith@test.com";
        arr[0][4] = "Instructor";

        arr[1][0] = "Jess";
        arr[1][1] = "White";
        arr[1][2] = "123-432-4453";
        arr[1][3] = "jess-white@test.com";
        arr[1][4] = "Mentor";

        arr[2][0] = "Amanda";
        arr[2][1] = "Simpson";
        arr[2][2] = "444-456-2321";
        arr[2][3] = "amanda-simpson@test.com";
        arr[2][4] = "Student";

        return arr;
    }

    @Test(testName = "US301: Verify Instructor registration", dataProvider = "details")
    public void test01(String first, String last, String phone, String email, String role){
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
}
