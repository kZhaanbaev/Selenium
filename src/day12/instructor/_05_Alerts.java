package day12.instructor;

import _utils.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/alert");
        Thread.sleep(2000);

        //NOTE: Follow README file first

        //Example: Alert page -> Add apple, Eat apple etc.
        driver.findElement(By.xpath("//button[@class='btn btn-success m-2']")).click();
        Thread.sleep(2000);

        //To accept the alert and close the pop-up alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //to input some text to the alert
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-outline-success']")).click();
        Thread.sleep(2000);

        alert = driver.switchTo().alert();
        alert.sendKeys("22");
        Thread.sleep(2000);
        alert.accept();

        //getting text of the alert and printing out
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-danger m-2']")).click();
        Thread.sleep(2000);

        alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        //NOTE: ClassTask3

        Thread.sleep(3000);
        driver.close();

    }
}
