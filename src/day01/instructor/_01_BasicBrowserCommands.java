package day01.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_BasicBrowserCommands {
    public static void main(String[] args) throws InterruptedException {
        //1. Connect the program with the chromedriver and geckodriver
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");

        //2. Launch a browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        //3. holds program until n number of milliSeconds
        Thread.sleep(500);

        //4. get title of the page
        System.out.println(driver.getTitle());

        //5. get current url of the webpage
        System.out.println(driver.getCurrentUrl());

        //5.a open www.weather.com and print title
        driver.get("https://www.weather.com");
        Thread.sleep(1000);

        //6. close the browser
        driver.close();


    }



}
