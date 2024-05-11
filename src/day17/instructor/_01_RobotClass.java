package day17.instructor;

import _utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class _01_RobotClass {
    //NOTE: ReadMe.md file
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/actionclass");

        Actions actions = new Actions(driver);

        //Robot Class - Drag and drop


        //to move mouse


        //to click mouse button and hold


        //to move to destination location


        //release mouse button


        Thread.sleep(3000);
        driver.close();

        // Class Task 1
    }


}
