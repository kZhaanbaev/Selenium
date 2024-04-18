package day04.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Review {
    /**
     * 1. Open https://www.coolthings.com/
     * 2. Verify title of the page is "CoolThings.com | Cool Stuff, Cool Gadgets, Cool Gifts & Things".
     * 3. Verify each page has expected headers:
     *  page: Gadgets -> header: Gadgets, Gifts -> Cool Gifts, Gear -> Gear, Toys -> Toys
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();

        // 1. Open https://www.coolthings.com/


        // 2. Verify title of the page is "CoolThings.com | Cool Stuff, Cool Gadgets, Cool Gifts & Things".


        // 3. Verify each page has expected headers:
        // page: Gadgets -> header: Gadgets, Gifts -> Cool Gifts, Gear -> Gear, Toys -> Toys
        //Option 1: Individual


        //Option 2: Grouped


        driver.close();







        //NOTE: ClassTask 1

    }
}
