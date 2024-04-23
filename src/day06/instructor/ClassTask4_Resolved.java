package day06.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ClassTask4_Resolved {
    /**
     *  1. Open url https://amazon.com
     *  2. In Footer section, print out descriptions of all footer buttons using "Desc" keyword of class attribute (use contains method)
     *  use 'span' tagName in your locator
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://amazon.com");

        Thread.sleep(7000);
        List<WebElement> list = driver.findElements(By.cssSelector("span[class*=Desc]"));
        list.forEach(each -> System.out.println(each.getText()));

        driver.close();
    }
}
