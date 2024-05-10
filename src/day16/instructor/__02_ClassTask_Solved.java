package day16.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class __02_ClassTask_Solved {
    /**
     * 	1. Go to url: "https://etsy.com"
     * 	2. Print out tooltip "Gift Mode".
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://etsy.com");

        Thread.sleep(3000);
        WebElement tooltip = driver.findElement(By.id("ge-tooltip-label-gift-mode"));
        System.out.println("Tooltip: " + tooltip.getText());

        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        WebElement icon = driver.findElement(By.xpath("//li[@data-gift-mode-nav-container]"));
        actions.moveToElement(icon).perform();

        Thread.sleep(3000);
        System.out.println("Tooltip: " + tooltip.getText());

        driver.close();
    }
}
