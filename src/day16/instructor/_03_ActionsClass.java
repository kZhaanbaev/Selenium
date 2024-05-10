package day16.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class _03_ActionsClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
//        driver.get("https://selenium-practice-app.herokuapp.com/#/inputs");
//
//        Actions actions = new Actions(driver);
//
//        //selecting a text that was entered by a user (Ctrl + A command)
//        WebElement inputField = driver.findElement(By.id("message"));
//        inputField.sendKeys("Hello World");
//
//        Thread.sleep(3000);
//        //by mouse action to select a text
//        //actions.moveToElement(inputField).click().doubleClick().perform();
//
//        //by keyboard action to select a text
//        actions.
//                keyDown(inputField, Keys.COMMAND).
//                sendKeys("a").
//                keyUp(Keys.COMMAND).
//                perform();
//
//        Thread.sleep(2000);
//        //copy above selected text and paste in other place (Ctrl + C and Ctr + V commands)
//        actions.
//                keyDown(Keys.COMMAND).
//                sendKeys("c").
//                keyUp(Keys.COMMAND).
//                perform();
//       actions.
//                keyDown(driver.findElement(By.xpath("//input[@id='a']")), Keys.COMMAND).
//                sendKeys("v").
//                keyUp(Keys.COMMAND).
//                perform();


        /**
         * Reading tooltips:
         * Tooltips with attribute values
         *  - With "title" attribute (youtube.com)
         *  - With "data-tip" attribute on Action-class page
         */


        //2. With hover over method (Actions page)
        driver.get("https://selenium-practice-app.herokuapp.com/#/actionclass");
        System.out.println(
                "Tooltip: " + driver.findElement(By.xpath("//button[@class='btn btn-success btn-lg m-2']")).getAttribute("data-tip"));

        //Print without hovering over first



        //Print with hover over using Actions class



        //Class Task 2

        Thread.sleep(3000);
        driver.close();
    }
}
