package day11.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _0_1_ClassTask_Review {
    /**
     * Note: Use only xpath locators
     *  1. Open https://github.com
     *  2. Click on 'Pricing' button
     *  3. Print out all bullet points in bold under Recommended section
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();

        //1
        driver.get("https://github.com");

        //2
        driver.findElement(By.xpath("//a[text()='Pricing']")).click();

        //3
        Thread.sleep(1000);
        List<WebElement> list = driver.findElements(By.xpath("//div[@data-hpc]/div[3]//summary/div/div/div[1]"));
        list.forEach(each -> System.out.println(each.getText()));

        driver.close();

    }
}
