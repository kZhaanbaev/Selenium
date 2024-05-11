package day17.instructor;

import _utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class _02_RobotClass {
    //NOTE: ReadMe.md file
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("http://automation.techleadacademy.io/#/files");

        Actions actions = new Actions(driver);

        //Robot Class - uploading a file from computer

        //Mac OS -------



        Thread.sleep(3000);
        driver.close();
    }


}
