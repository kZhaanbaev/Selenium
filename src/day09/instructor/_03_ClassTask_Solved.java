package day09.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _03_ClassTask_Solved {
    public static void main(String[] args) {
        /**
         * Task: print out text of all links that has href attribute value starting with "https"
         */
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/home");

        //your code goes here:
        List<WebElement> list = driver.findElements(By.xpath("//a[starts-with(@href, 'https')]"));
        list.forEach(each -> System.out.println(each.getText()));

    }
}
