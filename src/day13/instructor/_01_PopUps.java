package day13.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_PopUps {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/popup");

        //What is browser pop-ups? Pop-ups vs alerts?
        //Note: for pop-up you can inspect and locate elements
        //For alerts you cannot inspect

        //Example: Pop-Up page -> Message button
        driver.findElement(By.xpath("//button[@data-target='#exampleModal']")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("exampleInputEmail1")).sendKeys("john@test.com");
        driver.findElement(By.id("message-text")).sendKeys("Test message");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Send']")).click();

        driver.close();

        //Class Task 1
    }



}
