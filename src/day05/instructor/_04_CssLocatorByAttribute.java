package day05.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_CssLocatorByAttribute {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/#/home");

        // tag + [attribute=value] => print PHP Travels text of the link
        System.out.println(driver.findElement(By.cssSelector("a[href='https://phptravels.com/demo/']")).getText());

        //print header
        System.out.println(driver.findElement(By.cssSelector("h1[name=h1-text]")).getText());

        driver.close();

        //Note: ClassTask3
    }
}
