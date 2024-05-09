package day16.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//NOTE: README2-Actions.md
public class _02_ActionsClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/actionclass");

        Actions actions = new Actions(driver);
        Thread.sleep(1000);

        //Hover over the "Hover Over for the tooltip" button
        WebElement hoverElement = driver.findElement(By.xpath("//button[@class='btn btn-success btn-lg m-2']"));
        actions.moveToElement(hoverElement).perform();

        Thread.sleep(1000);
        //Double-click on the "Double-click me" button
        WebElement doubleClickElement = driver.findElement(By.xpath("//button[@class='btn btn-warning m-2 btn-lg']"));
        actions.doubleClick(doubleClickElement).perform();

        Thread.sleep(2000);
        //Right-click on the "Right-click me" button
        WebElement rightClickElement = driver.findElement(By.xpath("//button[@class='btn btn-info btn-lg m-2']"));
        actions.contextClick(rightClickElement).perform();

        Thread.sleep(2000);
        actions.moveByOffset(300, 0).perform();
        actions.contextClick().perform();

        actions.moveByOffset(300, 0).contextClick(rightClickElement).doubleClick(doubleClickElement).perform();

        //Class Task 1


        Thread.sleep(3000);
        driver.close();
    }
}
