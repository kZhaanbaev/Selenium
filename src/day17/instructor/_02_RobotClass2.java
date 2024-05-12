package day17.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class _02_RobotClass2 {
    //NOTE: ReadMe.md file
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/files");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.id("exampleFormControlFile1")).sendKeys("/Users/kuba/Desktop/Book1.xlsx");

        Thread.sleep(5000);
        driver.close();
    }


}
