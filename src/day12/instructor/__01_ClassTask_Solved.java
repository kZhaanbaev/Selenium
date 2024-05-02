package day12.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class __01_ClassTask_Solved {
    /**
     * Section: "Select a single option 2" section, Select color
     *      1. Print out all options
     *      2. Select option "Yellow" only
     */
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/selectclass");

        Select select = new Select(driver.findElement(By.name("select2")));
        List<WebElement> options = select.getOptions();
        options.forEach(each -> System.out.println(each.getText()));

        select.selectByVisibleText("Yellow");

        if (driver.findElement(By.cssSelector("#select2-selected-value > span")).getText().equals("Yellow")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.close();
    }
}
