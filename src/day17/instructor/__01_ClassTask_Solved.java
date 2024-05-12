package day17.instructor;

import _utils.Driver;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.InputEvent;

public class __01_ClassTask_Solved {
    /**
     *  Duration: 25min
     *  1. Navigate to url "https://jira.ivorreic.com/project/board"
     * 	2. Grab first Task under Backlog column and move to In Progress column
     * 	3. Use Robot class
     */
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://jira.ivorreic.com/project/board");

        Thread.sleep(15000);

        Robot robot = new Robot();
        Thread.sleep(2000);
        //pressing mouse to test in order to let below code to work
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        //moving mouse to the element
        Thread.sleep(2000);
        robot.mouseMove(475, 410);

        //pressing the mouse and holding
        Thread.sleep(2000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

        //moving the mouse down 200px (workaround)
        Thread.sleep(2000);
        robot.mouseMove(475, 700);

        //moving
        Thread.sleep(2000);
        robot.mouseMove(1150, 700);

        Thread.sleep(2000);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        Thread.sleep(2000);
        driver.close();
    }
}
