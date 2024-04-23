package day07.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_CssLocators_axis {
    /**
     * Child Elements
     * 1. Direct-child
     * 2. Sub-child (anything under the parent. Child, grand-child etc. doesn't matter.)
     * 3. Nth-child
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/selectors");
        //1. direct-child

        //a. locating first child of Parent 1

        //b. locating both direct children of Parent 1 only


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
