package day12.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class __02_ClassTask_Solved {
    /**
     * Section: "Nested drop-down menu"
     *      1. Click "Home" button
     *          Verify text "You have clicked -- Home -- button" is displayed
     *      2. Click "WordPress Development" -> "Plugins"
     *          Verify text "You have clicked -- Plugins -- button" is displayed
     *      3. Click "Front End Design" -> "JavaScript" -> "Ajax"
     * 			Verify you see text "You have clicked -- Ajax -- button"
     */
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/selectclass");

        //1
        driver.findElement(By.xpath("//li/a[text()='Home']")).click();
        if (driver.findElement(By.tagName("h4")).getText().equalsIgnoreCase(
                "You have clicked -- Home -- button")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        //2
        driver.findElement(By.xpath("//li/a[text()='WordPress Development']")).click();
        driver.findElement(By.xpath("//li/a[text()='Plugins']")).click();
        if (driver.findElement(By.tagName("h4")).getText().equalsIgnoreCase(
                "You have clicked -- Plugins -- button")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        //3
        driver.findElement(By.xpath("//li/a[text()='Front End Design']")).click();
        driver.findElement(By.xpath("//li/a[text()='JavaScript']")).click();
        driver.findElement(By.xpath("//li/a[text()='Ajax']")).click();
        if (driver.findElement(By.tagName("h4")).getText().equalsIgnoreCase(
                "You have clicked -- Ajax -- button")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.close();
    }
}
