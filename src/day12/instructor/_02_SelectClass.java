package day12.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/selectclass");

        //select multiple options (Example: Select IT roles)
        Select select = new Select(driver.findElement(By.id("cars")));
        Thread.sleep(1000);
        select.selectByIndex(1);
        Thread.sleep(1000);
        select.selectByVisibleText("Scrum master");
        Thread.sleep(1000);
        select.selectByValue("Stake holder");

        //check if selecting multiple options is enabled
        System.out.println(select.isMultiple());

        //deselect by text
        select.deselectByVisibleText("Scrum master");

        //deselect by index
        select.deselectByIndex(1);

        //deselect by value
        select.deselectByValue("Stake holder");


        //deselect all selected options
        select.deselectAll();

        //NOTE: ClassTask2

        Thread.sleep(3000);
        driver.close();
    }
}
