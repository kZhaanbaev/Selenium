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


        driver.close();
    }
}
