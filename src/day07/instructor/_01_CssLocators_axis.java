package day07.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_CssLocators_axis {
    /**
     * Child Elements
     * 1. Direct-child
     * 2. Sub-child (anything under the parent. Child, grand-child etc. doesn't matter.)
     * 3. Nth-child
     */

    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/#/selectors");
        //1. direct-child
        /**
         * parentElement > childElement
         * tagParent[attr=value]>tagChild[attr=value]
         */

        //a. locating first child of Parent 1
        System.out.println(driver.findElement(By.cssSelector("div[id=parent1] > div")).getText());

        //b. locating both direct children of Parent 1 only
        List<WebElement> parent1ChildList = driver.findElements(By.cssSelector("div[id=parent1] > div"));
        System.out.println(parent1ChildList.size());
        parent1ChildList.forEach(each -> System.out.println(each.getText()));

        //NOTE: ClassTask1


        //2. Sub-child (any child)

        //locating all children of Parent 1 (4)

        //NOTE: No task

        //Nth-children

        //locating first child of Child 3

        //locating last child of Child 3

        //locating 3rd child of Child 3

        //NOTE: ClassTask2


        driver.close();
    }
}
