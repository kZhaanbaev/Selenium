package day05.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_CssLocatorByClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/#/home");

        //By class in css selector => print first text under the title
        driver.findElement(By.className("text"));

        //with css
        System.out.println(driver.findElement(By.cssSelector(".text")).getText());

        //1. tag + class(.) => print first text under the title
        driver.findElement(By.cssSelector("div.text"));

        //2. tag + [class=value] => print first text under the title
        driver.findElement(By.cssSelector("div[class=text]"));

        // use '' in case there are spaces => on Calendar page print month/year
        driver.findElement(By.cssSelector("div[class='btn-sm rounded']"));

        driver.close();

        //Note: ClassTask2
    }
}
