package day05.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_CssLocatorByClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/");

        //By class in css selector => print first text under the title


        //1. tag + class(.) => print first text under the title


        //2. tag + [class=value] => print first text under the title


        // use '' in case there are spaces => on Calendar page print month/year


        driver.close();

        //Note: ClassTask2
    }
}
