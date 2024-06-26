package day03.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_BasicInteractions {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 1. Open google page
         * 2. Input "selenium" keyword in searchbar
         * 3. Click Search button
         * 4. Get value of href attribute of Wikipedia linkText of search result mini window
         *  4.1 Verify expected vs actual
         * 5. Print out header of the first item from the search result
         *  5.1 Verify if word contains a word "selenium"
         * 6. Verify if button "Shopping" is there. (is enabled)
         * 7. Verify if google logo on top left of the page is displayed
         */

        //Set up the driver
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1.
        driver.get("https://google.com");

        //2. Input "selenium" keyword in searchbar
        driver.findElement(By.id("APjFqb")).sendKeys("selenium");

        //3. Click Search button
        Thread.sleep(1000);
        driver.findElement(By.name("btnK")).click();

        //4. Get value of href attribute of Wikipedia linkText of search result mini window
        //Verify expected vs actual
        String expected = "https://en.wikipedia.org/wiki/Selenium_(software)";
        String actual = driver.findElement(By.linkText("Wikipedia")).getAttribute("href");

        if (expected.equalsIgnoreCase(actual)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        //5. Print out header of the first item from the search result
        //Verify if word contains a word "selenium"

//        WebElement headerElement = driver.findElement(By.tagName("h3"));
//        String header = headerElement.getText();

        String header = driver.findElement(By.tagName("h3")).getText();
        System.out.println(header);

        if (header.toLowerCase().contains("selenium")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        //6. Verify if button "Shopping" is there. (is enabled)
        System.out.println(driver.findElement(By.className("YmvwI")).isEnabled());

        //7. Verify if google logo on top left of the page is displayed
        System.out.println(driver.findElement(By.className("jfN4p")).isDisplayed());

        driver.close();
    }
}
