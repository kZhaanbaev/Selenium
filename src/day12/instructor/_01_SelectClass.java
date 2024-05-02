package day12.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _01_SelectClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/selectclass");

        //when to use Select class? (Example: Select number)
        //in order to use Select class, locator has to have a <select> tag
        Select select = new Select(driver.findElement(By.name("select1")));

        //select by text
        Thread.sleep(2000);
        select.selectByVisibleText("Three");

        //select by index
        Thread.sleep(2000);
        select.selectByIndex(1);

        //select by value
        Thread.sleep(2000);
        select.selectByValue("Eight");

        //how to get all selectable options?
        List<WebElement> options = select.getOptions();
        options.forEach(each -> System.out.println(each.getText()));

        //how to get selected option
        System.out.println("---------");
        System.out.println(select.getFirstSelectedOption().getText());

        //NOTE: ClassTask 1 - 10min


        Thread.sleep(4000);
        driver.close();

    }
}
