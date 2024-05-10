package day16.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class __01_ClassTask_Solved {
    /**
     * 	1. Go to url: https://jira.ivorreic.com/project/board
     * 	2. Print out text "NOT IMPLEMENTED" of a button "Releases"
     * 	Note: It won't print the text unless you hover over it
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://jira.ivorreic.com/project/board");

        Thread.sleep(15000);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//div[text()='Releases']"))).perform();

        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("//div[@class='sc-lhVmIH cGkyhG']")).getText());

        driver.close();
    }
}
