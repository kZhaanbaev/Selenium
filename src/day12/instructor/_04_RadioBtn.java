package day12.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_RadioBtn {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/selectclass");
        Thread.sleep(2000);

        //section: "Radio Button"
        driver.findElement(By.id("exampleRadios2")).click();


        Thread.sleep(2000);
        driver.close();
    }
}
