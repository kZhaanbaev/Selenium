package day03.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask1_Solved {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 1. Open automation practice web page
         * 2. Navigate to "Inputs" section of automation website directly
         * 3. Enter Message "Hello world"
         * 4. Click "Show message"
         * 5. Verify message displayed is same as expected
         */

        //Code goes here...
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1. Open automation practice web page
        driver.get("https://selenium-practice-app.herokuapp.com/#/home");

        //2. Navigate to "Inputs" section of automation website directly
        driver.findElement(By.linkText("Inputs")).click();

        //3. Enter Message "Hello world"
        String expectedText = "Hello World!";
        driver.findElement(By.id("message")).sendKeys(expectedText);

        //4. Click "Show message"
        driver.findElement(By.name("button1")).click();
        //driver.findElement(By.className("rounded")).click();

        //5. Verify message displayed is same as expected
        String actualText = driver.findElement(By.name("message1")).getText();

        if (expectedText.equalsIgnoreCase(actualText)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.close();
    }
}
