package day02.instructor;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask2_Solved {
    public static void main(String[] args) {
        /**
         * 1. Open google web page
         * 2. Print out text of the button "Google Search" using "aria-label" attribute value
         * 3. Print out text of the "Images" link on top right corner of the page
         */
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();

        //1
        driver.get("https://google.com");

        //2
        WebElement element = driver.findElement(By.name("btnK"));
        System.out.println(element.getAttribute("aria-label"));

        //3
        System.out.println(driver.findElement(By.linkText("Images")).getText());


        driver.close();
    }
}
