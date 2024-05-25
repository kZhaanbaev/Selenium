package day_23.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _06_ClassTask_Solved {
    /**
     * 1. Copy all 3 Tests from the _01_ClassTask and paste it here
     * 2. Combine all 3 Tests in 1 using dataProviders
     */

    @DataProvider(name = "inputText")
    public Object[] data(){
        Object[] arr = {
                "Java is hard",
                "It's possible to get better in Java",
                "I have to try harder to get better"
        };
        return arr;
    }

    @Test(testName = "US101: Verify Input message", dataProvider = "inputText")
    public void test01(String text){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/inputs");
        driver.findElement(By.id("message")).sendKeys(text);
        driver.findElement(By.name("button1")).click();
        Assert.assertEquals(driver.findElement(By.name("message1")).getText(), text);
        Driver.closeDriver();
    }

}
