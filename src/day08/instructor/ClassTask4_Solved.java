package day08.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ClassTask4_Solved {
    /**
     * 1. Navigate to http://code-vista.net/home
     * 2. Input following credentials and login:
     *      username: tla.liveproject.team1@gmail.com
     *      password: b2e842cb-df29-46a9-b54a-23a2b0a22ccc
     * 3. Click on module "Casting"
     * 4. Print out each task name using a css locator without using a List
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("http://code-vista.net/home");

        //login
        driver.findElement(By.cssSelector("#form3Example3")).sendKeys("tla.liveproject.team1@gmail.com");
        driver.findElement(By.cssSelector("#form3Example4")).sendKeys("b2e842cb-df29-46a9-b54a-23a2b0a22ccc");
        driver.findElement(By.cssSelector("button[class='btn btn-primary btn-lg']")).click();

        //printing individually
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".card:nth-child(5) h3")).click();

        //print-out each task
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.cssSelector("div[class=col-md-4] > div[class=list-group]:nth-child(2) button")).getText());
        System.out.println(driver.findElement(By.cssSelector("div[class=col-md-4] > div[class=list-group]:nth-child(3) button")).getText());
        System.out.println(driver.findElement(By.cssSelector("div[class=col-md-4] > div[class=list-group]:nth-child(4) button")).getText());
        System.out.println(driver.findElement(By.cssSelector("div[class=col-md-4] > div[class=list-group]:last-child button")).getText());

        driver.close();
    }
}
