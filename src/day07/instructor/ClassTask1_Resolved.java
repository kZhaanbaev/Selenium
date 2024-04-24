package day07.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassTask1_Resolved {
    /**
     * Print out vehicle types only under Porsche section.
     * Note: text will print out vehicle types and also all vehicle models just because models are located
     * under the vehicle types by the hierarchy.
     * But result should contain only 4 elements in the List.
     */

    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/#/selectors");
        List<WebElement> list = driver.findElements(By.cssSelector("div[id=porsche] > div[class='vehicle-types row'] > div"));

        list.forEach(each -> System.out.println(each.getText() + "\n\n"));

        //to find only vehicle type texts, not including vehicle names use below locator
        //div[id=porsche] > div[class='vehicle-types row'] > div > div[class='vehicle-type']

        driver.close();
    }
}
