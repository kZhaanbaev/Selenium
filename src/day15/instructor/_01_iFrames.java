package day15.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_iFrames {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/iframes");

        //1. access TLA website and print main text "Hello! I am the parent iFrame without switching
        driver.switchTo().frame("parent-iframe");
        System.out.println(driver.findElement(By.id("iframe-text")).getText());


        //2. NOTE: README.md file

        //3. access parent iFrame and print text again with switching

        //4. access child iFrame - budget calc
        //input Transaction name and amount

        //5. access child iFrame - wiki
        // print listed languages

        //6. navigation from one iframe to another, child to parent, etc.

        //Class Task 1

        driver.close();
    }
}
