package day18.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class _01_JsExecutor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");
        Thread.sleep(3000);

        //Scroll into view
        WebElement linksHeaderElement = driver.findElement(By.id("links-header"));

//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        jsExecutor.executeScript("arguments[0].scrollIntoView(true)", linksHeaderElement);
        Driver.moveIntoViewWithJsExecutor(linksHeaderElement);


        //highlight linksHeaderElement
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        Thread.sleep(2000);
//
//        jsExecutor.executeScript("arguments[0].setAttribute('style','border: solid 2px red');", linksHeaderElement);
//        jsExecutor.executeScript("arguments[0].style.backgroundColor='yellow'", linksHeaderElement);
//
//        Thread.sleep(2000);
//        jsExecutor.executeScript("arguments[0].setAttribute('style','border: none');", linksHeaderElement);
//        jsExecutor.executeScript("arguments[0].style.backgroundColor=null", linksHeaderElement);
        Driver.highlightElement(linksHeaderElement);

        Thread.sleep(3000);
        driver.close();
    }

    //Class Task 1
}
