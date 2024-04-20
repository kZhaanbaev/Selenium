package day05.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask3_Resolved {
    /**
     * 1. Open https://demo.applitools.com/
     * 2. Input username and password using "placeholder" attributes to locate elements
     * 3. Click on Sign in button
     * 4. Verify name "Jack Gomez" is displayed
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.applitools.com/");

        //2
        driver.findElement(By.cssSelector("input[placeholder='Enter your username']")).sendKeys("test");
        driver.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("test");

        //3
        driver.findElement(By.cssSelector("a[class='btn btn-primary']")).click();

        //4
        System.out.println(driver.findElement(By.cssSelector(".logged-user-name")).isDisplayed());

        //5
        if (driver.findElement(By.cssSelector(".logged-user-name")).getText().equalsIgnoreCase("Jack Gomez")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.close();
    }
}
