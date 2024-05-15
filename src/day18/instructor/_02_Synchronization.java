package day18.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class _02_Synchronization {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();

        //implicit wait goes here
        driver.get("https://selenium-practice-app.herokuapp.com/?#/synchronization");

        //IMPLICITLY wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //System.out.println(driver.findElement(By.id("Kuba")).getText());

        //EXPLICIT waits
        //1. wait for element to be present (Text display section)
        WebDriverWait wait = new WebDriverWait(driver, 10);

//        driver.findElement(By.id("input-text")).sendKeys("Hello World!");
//        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//
//        WebElement displayedText = driver.findElement(By.id("text-display"));
//
//        wait.until(ExpectedConditions.textToBe(By.id("text-display"), "Hello World!"));

        //2. wait for the alert to be displayed and then print out the text (Alert section)
        driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();


        Thread.sleep(3000);
        driver.close();
    }

    //Class Task 3
}
