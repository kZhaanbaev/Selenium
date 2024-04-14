package day02.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//NOTE: Refer to README.md first
public class _02_BasicLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/#/home");

        //locate by id
        String header = driver.findElement(By.id("title")).getText();
        System.out.println(header);

        //locate by name
        System.out.println(driver.findElement(By.name("div-text")).getText());

        //locate by className
        System.out.println(driver.findElement(By.className("row")).getText());

        //locate by tagName
        System.out.println(driver.findElement(By.tagName("h1")).getText());

        //locate by linkText
        System.out.println(driver.findElement(By.linkText("Internet")).getText());
        System.out.println(driver.findElement(By.linkText("Internet")).isDisplayed());

        //locate by partialLinkText
        //NOTE: It is case sensitive
        System.out.println(driver.findElement(By.partialLinkText("Tea")).getText());

        //locating attributes
        //Example 1:
        System.out.println(driver.findElement(By.id("selenium-img")).getAttribute("src"));

        //Example 2:
        System.out.println(driver.findElement(By.id("php-travels")).getAttribute("href"));
        System.out.println(driver.findElement(By.linkText("PHP Travels")).getAttribute("href"));

        driver.close();

        //NOTE: ClassTask2 after competing of this demo

    }
}
