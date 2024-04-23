package day06.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ClassTask2_Resolved {
    /**
     *  1. Open url https://selenium-practice-app.herokuapp.com/#/selectors
     *  2. In Demo section, print out all sub-child elements that has class value starting with a keyword "sub"
     */
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/#/selectors");

        List<WebElement> list = driver.findElements(By.cssSelector("div[class^=sub]"));
        list.forEach(each -> System.out.println(each.getText()));

        driver.close();
    }
}
