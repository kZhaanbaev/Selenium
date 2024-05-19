package day_21.instructor;

import _utils.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_ClassTaskTest_Review {
    /**
     * - Open https://selenium-practice-app.herokuapp.com/?#/home
     * - Navigate to Alert page
     * - Click on green Add button
     * - Verify alert has a text "Are you sure?"
     */
    @Test
    public void test01(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");
        driver.findElement(By.linkText("Alert")).click();

        driver.findElement(By.xpath("//button[@class='btn btn-success m-2']")).click();
        Alert alert = driver.switchTo().alert();

        Assert.assertTrue(alert.getText().contains("Are you sure?"));
        alert.dismiss();
        driver.close();
    }


    /**
     * - Open https://selenium-practice-app.herokuapp.com/?#/home
     * - Navigate to Alert page
     * - Click on green Add button
     * - Accept the alert
     * - Verify count of apples updated to 1
     */
    @Test
    public void test02(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");
        driver.findElement(By.linkText("Alert")).click();

        //capturing test data first
        String data = driver.findElement(By.tagName("h1")).getText();

        driver.findElement(By.xpath("//button[@class='btn btn-success m-2']")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        String actualData = driver.findElement(By.tagName("h1")).getText();

        Assert.assertEquals(Integer.parseInt(actualData), Integer.parseInt(data) + 1);

        if (Integer.parseInt(data) + 1 == Integer.parseInt(actualData)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.close();
    }

    /**
     * - Open https://selenium-practice-app.herokuapp.com/?#/home
     * - Navigate to Alert page
     * - Click on green Add button
     * - Cancel the alert
     * - Verify count of apples didn't change
     */
    @Test
    public void test03(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");
        driver.findElement(By.linkText("Alert")).click();

        //capturing test data first
        String data = driver.findElement(By.tagName("h1")).getText();

        driver.findElement(By.xpath("//button[@class='btn btn-success m-2']")).click();

        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        String actualData = driver.findElement(By.tagName("h1")).getText();

        Assert.assertEquals(Integer.parseInt(actualData), Integer.parseInt(data));

        driver.close();
    }

}
