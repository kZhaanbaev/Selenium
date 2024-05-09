package day15.instructor;

import _utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//NOTE: README2-Actions.md
public class _02_ActionsClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/actionclass");

        Actions actions = new Actions(driver);

        //Hover over the "Hover Over for the tooltip" button


        //Double-click on the "Double-click me" button


        //Right-click on the "Right-click me" button


        //Class Task 1


        Thread.sleep(3000);
        driver.close();
    }
}
