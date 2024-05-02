package day12.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_SelectClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "path");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/selectclass");

        //when to use Select class? (Example: Select number)

        //select by text

        //select by index

        //select by value

        //how to get all selectable options?


        //NOTE: ClassTask 1 - 10min


        Thread.sleep(3000);
        driver.close();

    }
}
