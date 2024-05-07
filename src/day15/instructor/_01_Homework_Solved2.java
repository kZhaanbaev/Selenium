package day15.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_Homework_Solved2 {
    /**
     * 	Print out age + emails if age of the person is between 40 and 50 (from all 10 pages)
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/tables");

        while(driver.findElement(By.xpath("//span[text()='Next']")).isDisplayed()){
            //find items on each page
            List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
            for (WebElement each: rows){
                String age = each.findElement(By.xpath("./td[4]")).getText();
                String email = each.findElement(By.xpath("./td[6]")).getText();

                if (Integer.parseInt(age) > 40 && Integer.parseInt(age) < 50){
                    System.out.println("Age: " + age + " | email: " + email);
                }
            }

            //click next
            driver.findElement(By.xpath("//span[text()='Next']")).click();
            Thread.sleep(1000);
        }

        driver.close();
    }
}
