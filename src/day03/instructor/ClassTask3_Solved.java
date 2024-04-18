package day03.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask3_Solved {
    public static void main(String[] args) {
        /**
         * 1. Fill out the form in "Contact Us Today!" section
         * 2. Verify message "Thanks for contacting us,
         * we will get back to you shortly." is displayed
         */

        //Code 3 goes here...
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/home");
        driver.findElement(By.linkText("Inputs")).click();

        //1. Fill out the form in "Contact Us Today!" section
        driver.findElement(By.name("first_name")).sendKeys("John");
        driver.findElement(By.name("last_name")).sendKeys("John");
        driver.findElement(By.name("email")).sendKeys("John");
        driver.findElement(By.name("phone")).sendKeys("John");
        driver.findElement(By.name("address")).sendKeys("John");
        driver.findElement(By.name("city")).sendKeys("John");
        driver.findElement(By.name("state")).sendKeys("Virginia");
        driver.findElement(By.name("zip")).sendKeys("John");

        //click submit button
        driver.findElement(By.name("button3")).click();

        //2. Verify message
        if (driver.findElement(By.name("answer3")).getText()
                .equals("Thanks for contacting us, we will get back to you shortly.")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }


        driver.close();
    }
}
