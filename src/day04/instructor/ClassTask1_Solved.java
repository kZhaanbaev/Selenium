package day04.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask1_Solved {
    /**
     * 1. Open "https://www.howstuffworks.com/"
     * 2. Click on navigation button
     * 3. Verify h1 header has same text as navigation button
     * 4. Apply logic on step 3 to all pages from navigation bar
     */

    public static void main(String[] args) throws InterruptedException {
        //These are expected headers:
        //"Health", "Science", "Home & Garden", "Auto", "Tech", "Garden", "Money", "Lifestyle", "Entertainment",
        //"Adventure", "Animals", "Quizzes", "Coupons"

        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.howstuffworks.com/");


        driver.close();
    }
}
