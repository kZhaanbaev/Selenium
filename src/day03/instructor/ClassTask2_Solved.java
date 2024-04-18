package day03.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask2_Solved {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 1. Input number a and number b
         * 2. Click Get Total button
         * 3. Verify if sum of 2 numbers are as expected
         */

        //Code 2 goes here...
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/home");
        driver.findElement(By.linkText("Inputs")).click();

        //creating a test data
        int num1 = 12;
        int num2 = 7;

        //1. Input number a and number b
        driver.findElement(By.id("a")).sendKeys(num1 + "");
        driver.findElement(By.id("b")).sendKeys(num2 + "");

        //2. Click Get Total button
        driver.findElement(By.name("button2")).click();

        //3. Verify if sum of 2 numbers are as expected
        int sum = num1 + num2;

        String result = driver.findElement(By.name("answer2")).getText();
        int actualResult = Integer.parseInt(result);

        if (sum == actualResult){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.close();
    }
}
