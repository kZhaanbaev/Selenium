package day08.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ClassTask3_Solved {
    /**
     * 1. Navigate to http://code-vista.net/home
     * 2. Input following credentials and login:
     *      username: tla.liveproject.team1@gmail.com
     *      password: b2e842cb-df29-46a9-b54a-23a2b0a22ccc
     * 3. Print out following options:
     *      a. All module names using a list
     *      b. "Office Hour Tasks" only without using the list
     *      c. "Exceptions" module only without using the list
     *      d. "Casting" module only without using the list
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("http://code-vista.net/home");

        //login
        driver.findElement(By.cssSelector("#form3Example3")).sendKeys("tla.liveproject.team1@gmail.com");
        driver.findElement(By.cssSelector("#form3Example4")).sendKeys("b2e842cb-df29-46a9-b54a-23a2b0a22ccc");
        driver.findElement(By.cssSelector("button[class='btn btn-primary btn-lg']")).click();

        //print all module names
        Thread.sleep(1000);
        List<WebElement> list = driver.findElements(By.cssSelector("h3"));
        //list.forEach(each -> System.out.println(each.getText()));

        //printing individually
        System.out.println(driver.findElement(By.cssSelector(".card:first-child h3")).getText());
        System.out.println(driver.findElement(By.cssSelector(".card:last-child h3")).getText());
        System.out.println(driver.findElement(By.cssSelector(".card:nth-child(5) h3")).getText());


        driver.close();
    }
}
