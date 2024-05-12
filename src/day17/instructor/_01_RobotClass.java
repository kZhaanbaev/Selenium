package day17.instructor;

import _utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.InputSource;

import java.awt.*;
import java.awt.event.InputEvent;

public class _01_RobotClass {
    //NOTE: ReadMe.md file
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/actionclass");

        Actions actions = new Actions(driver);

        //Robot Class - Drag and drop
        Robot robot = new Robot();
        Thread.sleep(3000);

        //test click
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        //to move mouse
        robot.mouseMove(545, 725);

        //to click mouse button and hold
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

        //to move to destination location
        Thread.sleep(3000);
        robot.mouseMove(945, 725);

        //release mouse button
        Thread.sleep(3000);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        Thread.sleep(3000);
        driver.close();

        // Class Task 1
    }


}
