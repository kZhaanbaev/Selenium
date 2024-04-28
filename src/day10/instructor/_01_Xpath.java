package day10.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //parent -> child


        //parent -> all children


        //indexes [n]


        //keywords: last(), last()-n


        //and, or keywords in xpath


        driver.close();

        //NOTE: ClassTask1
    }
}
