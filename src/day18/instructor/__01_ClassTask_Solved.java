package day18.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class __01_ClassTask_Solved {
    /**
     *  1. Open https://selenium-practice-app.herokuapp.com/?#/home
     *  2. Navigate to Inputs page
     *  3. Scroll window down to the footer section
     *  4. Highlight the footer section
     */
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/home");

        Driver.sleep(2000);
        Driver.highlightElement(driver.findElement(By.linkText("Inputs"))).click();
//        driver.findElement(By.linkText("Inputs")).click();

        Driver.sleep(2000);
//        Driver.moveIntoViewWithJsExecutor(driver.findElement(By.id("copyright")));
        Driver.highlightElement(driver.findElement(By.id("copyright")));

        driver.close();
    }
}
