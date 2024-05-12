package day17.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class _02_RobotClass {
    //NOTE: ReadMe.md file
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/files");
        driver.manage().window().maximize();

        //Robot Class - uploading a file from computer

        //Mac OS -------
        Robot robot;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        //opening file upload window page
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("exampleFormControlFile1"))).click().perform();

        //copy path of a file to the clipboard
        //"/Users/kuba/Desktop/Book1.xlsx"
        StringSelection path = new StringSelection("/Users/kuba/Desktop/Book1.xlsx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);

        Thread.sleep(2000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        Thread.sleep(2000);
        //pressing shortcut CMD + SHIFT + G to open small window to enter path of the file
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);

        //releasing 3 buttons
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_G);

        //pressing CMD + V to paste path of the file
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);

        //releasing buttons
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_V);

        //releasing buttons
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        //releasing buttons
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


        Thread.sleep(5000);
        driver.close();
    }


}
