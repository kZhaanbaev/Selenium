package day09.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io");
        //locating header of the page

        //tag + attribute


        //tag + attribute + attribute


        //asterisk *


        driver.close();

        //NOTE: ClassTask1

    }
}
