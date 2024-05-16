package day_19;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class _03_ClassTask_Solved {
    /**
     *  1. Open http://automation.techleadacademy.io/#/synchronization
     *  2. Input City name in Weather Dashboard section
     *  3. Click Red button
     *  4. Print out weather details for the city
     */
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://selenium-practice-app.herokuapp.com/?#/synchronization");

        driver.findElement(By.name("search")).sendKeys("Fairfax");
        driver.findElement(By.xpath("//form/button")).click();

        WebDriverWait wait = new WebDriverWait(driver, 20);

        WebElement element = driver.findElement(By.id("weather-dashboard"));
        wait.until(ExpectedConditions.visibilityOf(element));
        System.out.println(element.getText());

        driver.close();
    }
}
