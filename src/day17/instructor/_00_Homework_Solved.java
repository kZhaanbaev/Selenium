package day17.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class _00_Homework_Solved {
    public static void main(String[] args) throws InterruptedException {
        /**
         *  1. Copy "Hello! I am the parent iFrame" text using Actions class -> Cmd + C
         * 	2. In Shared notes:
         * 		Title = your name
         *      Note = paste copied text using Actions class -> Cmd + V
         */
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/iframes");

        driver.switchTo().frame("parent-iframe");
        WebElement element = driver.findElement(By.id("iframe-text"));

        element.click();

        Actions actions = new Actions(driver);
        actions.click(element)
                .doubleClick()
                .keyDown(Keys.COMMAND)
                .sendKeys("c")
                .keyUp(Keys.COMMAND)
                .perform();

        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("note");

        driver.findElement(By.className("note-title")).sendKeys("Kuba");

        actions.keyDown(driver.findElement(By.className("note-textarea")), Keys.COMMAND)
                .sendKeys("v")
                .keyUp(Keys.COMMAND)
                .perform();


    }
}
