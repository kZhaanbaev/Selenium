package day07.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask2_Resolved {
    /**
     * 1. Navigate to url "https://demo.opencart.com/".
     * 2. Use first-child, last-child and nth-child options.
     * 3. Print out following from navigation bar:
     *      a. Desktops
     *      b. MP3 Players
     *      c. Software
     */

    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demo.opencart.com/");

        System.out.println(driver.findElement(By.cssSelector("li[class^='nav-item']:first-child")).getText());
        System.out.println(driver.findElement(By.cssSelector("li[class^='nav-item']:nth-child(5)")).getText());
        System.out.println(driver.findElement(By.cssSelector("li[class^='nav-item']:last-child")).getText());

        driver.close();
    }
}
