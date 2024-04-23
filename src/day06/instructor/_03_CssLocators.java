package day06.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _03_CssLocators {
    /**
     * 1. tag + class + attribute (chaining)
     * 2. sub-string matches:
     *      a. starts-with
     *      b. ends-with
     *      c. contains
     */

    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/#/home");

        //------ chaining = using multiple attributes -------
        //tag[attr1=value1][attr2=value2]
        //div[class=value][name=value]
        //on Inputs page to get only form fields
        driver.findElement(By.cssSelector("input[class=form-control][type=text]"));

        //example2:
        driver.findElement(By.cssSelector("a[class='navbar-brand ml-3'][href='#/inputs']"));

        //------ sub-strings work with values of the attributes only ------
        //sub-string starts-with -> attr^=value -> tag[attr^=value]
        List<WebElement> list = driver.findElements(By.cssSelector("a[href^='https://']"));


        //NOTE: ClassTask2


        //------ sub-string ends-with ----------
        //attr$=value -> tag[attr$=value]
        List<WebElement> list1 = driver.findElements(By.cssSelector("a[href$='.com/']"));

        //NOTE: ClassTask3


        //------ sub-string contains -----------
        //attr*=value -> tag[attr*=value]
        List<WebElement> list2 = driver.findElements(By.cssSelector("a[href*=practice]"));

        //NOTE: ClassTask4


        driver.close();

    }
}
