package day12.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_SelectClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/selectclass");

        //select multiple options (Example: Select IT roles)


        //check if selecting multiple options is enabled


        //deselect by text


        //deselect by index


        //deselect by value


        //deselect all selected options


        //NOTE: ClassTask2

        Thread.sleep(3000);
        driver.close();
    }
}
