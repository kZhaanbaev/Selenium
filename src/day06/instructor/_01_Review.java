package day06.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Review {
    /**
     * basic selectors
     * css selectors:
     * 		id
     * 		class
     * 		tag + id
     * 		tag + class
     *      tag + attribute
     */

    public static void main(String[] args) {
        Driver.getDriver().get("https://selenium-practice-app.herokuapp.com/#/home");

        //id
        Driver.getDriver().findElement(By.cssSelector("#titleValue"));

        //class
        Driver.getDriver().findElement(By.cssSelector(".classValue"));

        //tag + id
        Driver.getDriver().findElement(By.cssSelector("h1[id=value]"));

        //tag + class
        Driver.getDriver().findElement(By.cssSelector("a[class='value1 value2']"));

        //tag + attribute
        Driver.getDriver().findElement(By.cssSelector("div[data-test=value]"));

        //when we don't want to specify tagName
        Driver.getDriver().findElement(By.cssSelector("*[name=paragraph]"));
    }
}
