package day13.instructor;

import _utils.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class _02_MultipleWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();

        //What is considered as multiple windows in selenium?

        //What is firstWindowID (Global Unique Identifier) and how to locate it?
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");
        System.out.println(driver.getTitle());

        String firstWindowID = driver.getWindowHandle();
        System.out.println(firstWindowID);
        System.out.println("------");

        //Example: Home page -> sauce demo link texts -> print titles of the pages
        driver.findElement(By.linkText("Saucedemo")).click();

        Set<String> windowIds = driver.getWindowHandles();
        windowIds.forEach(each -> System.out.println(each));
        System.out.println("-----");

        //Alert alert = driver.switchTo().alert();
        //driver.switchTo().window("376FD08D14D20AFF45162943C613232C");

        for (String each: windowIds){
            if (!each.equals(firstWindowID))
                driver.switchTo().window(each);
        }

        System.out.println(driver.getTitle());
        String secondWindowId = driver.getWindowHandle();
        System.out.println(secondWindowId);


        Thread.sleep(2000);
        //How to return to the main page?
        driver.switchTo().window(firstWindowID);
        System.out.println("-----");


        //Example 2: Test title of Internet link
        driver.findElement(By.linkText("Internet")).click();

        windowIds = driver.getWindowHandles();
        windowIds.forEach(each -> System.out.println(each));
        System.out.println("-----");

        for (String each: windowIds){
            if (!each.equals(firstWindowID) && !each.equals(secondWindowId))
                driver.switchTo().window(each);
        }

        System.out.println(driver.getTitle());

//        for (String each: windowIds){
//            driver.switchTo().window(each);
//            if (driver.getTitle().equals("The Internet")){
//                System.out.println(driver.getTitle());
//                System.out.println(driver.findElement(By.tagName("li")).getText());
//            }
//        }

        //Difference between driver.close and driver.quit?
        //driver.close -> closes only the active window
        Thread.sleep(3000);
        driver.close();

        //driver.quit -> will close all windows, regardless if active or not
        Thread.sleep(3000);
        driver.quit();
    }
}
