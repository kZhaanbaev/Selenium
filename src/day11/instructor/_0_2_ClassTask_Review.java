package day11.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _0_2_ClassTask_Review {
    /**
     * Note: Use only xpath locators
     *  1. Open https://phptravels.com/demo/
     *  2. In footer section, under RESOURCES, print out 5 bullet points
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://phptravels.com/demo/");

        //2
        Thread.sleep(1000);
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='row']/div[3]/a"));
        list.forEach(each -> System.out.println(each.getText()));

        driver.close();
    }
}
