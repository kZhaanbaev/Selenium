package day_21.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _03_ClassTaskTest_Review {
    /**
     * - Open https://selenium-practice-app.herokuapp.com/?#/home
     * - Navigate to Select-class page
     * - Select number Two in "Select number" section
     * - Verify text "Two" is displayed
     */
    @Test
    public void test01(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");
        driver.findElement(By.linkText("Select-class")).click();

        Select select = new Select(driver.findElement(By.name("select1")));
        select.selectByVisibleText("Two");

        Assert.assertTrue(driver.findElement(By.id("select1-selected-value")).getText().contains("Two"));
        driver.close();
    }


    /**
     * - Open https://selenium-practice-app.herokuapp.com/?#/home
     * - Navigate to Select-class page
     * - Verify drop-down in "Select color" section contains color "Green" option
     */
    @Test
    public void test02(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");
        driver.findElement(By.linkText("Select-class")).click();

        Select select = new Select(driver.findElement(By.name("select2")));
        List<WebElement> elementList = select.getOptions();

        WebElement greenElement = null;
        for (WebElement eachElement: elementList){
            if (eachElement.getText().equals("Green"))
                greenElement = eachElement;
        }

        Assert.assertNotNull(greenElement);
        driver.close();
    }

}
