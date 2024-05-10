package day16.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionsClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/actionclass");
        Thread.sleep(3000);

        //Drag and Drop option with Actions class
        WebElement todo1 = driver.findElement(By.id("todo1"));
        WebElement todo2 = driver.findElement(By.id("todo2"));
        WebElement todo3 = driver.findElement(By.id("todo3"));

        WebElement dropOffElementLocation = driver.findElement(By.id("div1"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(todo2, dropOffElementLocation).perform();
        actions.dragAndDrop(todo1, dropOffElementLocation).perform();



        //Class Task 3

        Thread.sleep(3000);
        driver.close();
    }
}
