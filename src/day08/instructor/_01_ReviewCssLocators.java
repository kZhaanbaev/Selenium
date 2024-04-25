package day08.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


//HOW TO LOCATE AN ELEMENT IN DIFFERENT WAYS?
public class _01_ReviewCssLocators {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/#/selectors");

        //print out Red, Green, Blue and Yellow colors under Car color section
//        System.out.println(driver.findElement(By.cssSelector("#red-color")).getText());
//        System.out.println(driver.findElement(By.cssSelector("li[name=green-color]")).getText());
//        System.out.println(driver.findElement(By.cssSelector(".yellow-color")).getText());

        //1st option to print "Blue"
        List<WebElement> list1 = driver.findElements(By.cssSelector("li"));
        System.out.println(list1.size());
        System.out.println(list1.get(8).getText());
        System.out.println("-------");

        //2nd option
        List<WebElement> list2 = driver.findElements(By.cssSelector(".selectors-flexBox > li"));
        System.out.println(list2.size());
        System.out.println(list2.get(3).getText());
        System.out.println("-------");

        //3rd option
        //using NOT keyword to not include specific attribute or tag, or combination of those 2
        //syntax: locator:not(locator not to include)
        //tag[attr=value]:not(tag[attr=value]), attr=value:not(attr=value)
        //Examples: a[class=test]:not(a[class=test2]), #idValue:not(.classValue)
        List<WebElement> list3 = driver.findElements(By.cssSelector(".selectors-flexBox:not(#ball) > li"));
        System.out.println(list3.size());
        System.out.println(list3.get(3).getText());
        System.out.println("--------");

        //4th option
        System.out.println(driver.findElement(By.cssSelector(".selectors-flexBox:not(#ball) > li:nth-child(4)")).getText());


        driver.close();
    }

}
