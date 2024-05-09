package day15.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_iFrames {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/iframes");

        //1. access TLA website and print main text "Hello! I am the parent iFrame without switching

        //2. NOTE: README.md file

        //3. access parent iFrame and print text again with switching
//        driver.switchTo().frame("parent-iframe");
//        System.out.println(driver.findElement(By.id("iframe-text")).getText());

        //4. access child iFrame - budget calc
        //input Transaction name and amount
        driver.switchTo().frame("parent-iframe");
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='note']")));
        driver.switchTo().frame("budget-tracker");
        driver.findElement(By.id("t-name")).sendKeys("MacBook");
        driver.findElement(By.id("t-amount")).sendKeys("1500");

        //5. access child iFrame - wiki
        // print listed languages
        driver.switchTo().parentFrame();
        driver.switchTo().frame("wikipedia");

        List<WebElement> languages = driver.findElements(By.xpath("//nav/div/a[@class='link-box']"));
        //languages.forEach(each -> System.out.println(each.getText()));

        //6. navigation from one iframe to another, child to parent, etc.
        driver.switchTo().defaultContent();

        //Class Task 1

        driver.close();
    }
}
