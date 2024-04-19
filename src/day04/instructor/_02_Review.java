package day04.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

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
        driver.get("https://www.coolthings.com/");

        // 2. Verify title of the page is "CoolThings.com | Cool Stuff, Cool Gadgets, Cool Gifts & Things".


        // 3. Verify each page has expected headers:
        // page: Gadgets -> header: Gadgets, Gifts -> Cool Gifts, Gear -> Gear, Toys -> Toys
        //Option 1: Individual
        driver.findElement(By.linkText("GADGETS")).click();
        if (driver.findElement(By.tagName("h1")).getText().equalsIgnoreCase("Gadgets")){
            System.out.println("Header test PASS");
        }else {
            System.out.println("Header test FAIL");
        }

        //Option 2: Grouped
        Map<String, String > data = new HashMap<>();
        data.put("GADGETS", "Gadgets");
        data.put("GIFTS", "Gifts");
        data.put("GEAR", "Gear");
        data.put("TOYS", "Cool Toys");

        for (String each: data.keySet()){
            driver.findElement(By.linkText(each)).click();
            if (driver.findElement(By.tagName("h1")).getText().equalsIgnoreCase(data.get(each))){
                System.out.println("Header test PASS");
            }else {
                System.out.println(data.get(each) + " - Header test FAIL");
                System.out.println("Expected is " + data.get(each) + " | Actual was: " + driver.findElement(By.tagName("h1")).getText());
            }
        }

        driver.close();

        //NOTE: ClassTask 1

    }
}
