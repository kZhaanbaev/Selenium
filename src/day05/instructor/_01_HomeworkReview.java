package day05.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_HomeworkReview {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //print all usernames
        System.out.println(driver.findElement(By.id("login_credentials")).getText());

        //input credentials
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //click sing in button
        driver.findElement(By.id("login-button")).click();

        //print name and price of all items
        List<WebElement> names = driver.findElements(By.className("inventory_item_name"));
        List<WebElement> price = driver.findElements(By.className("inventory_item_price"));

        names.forEach(each -> System.out.println(each.getText()));
        price.forEach(each -> System.out.println(each.getText()));

//        for (WebElement each: names){
//            System.out.println(each.getText());
//        }

        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i).getText() + " | " + price.get(i).getText());
        }

        //click on the first item
        names.get(0).click();

        //print name
        System.out.println(driver.findElement(By.className("inventory_details_name")).getText());

        //print description
        System.out.println(driver.findElement(By.className("inventory_details_desc")).getText());

        //print price
        System.out.println(driver.findElement(By.className("inventory_details_price")).getText());

        driver.close();
    }

}
