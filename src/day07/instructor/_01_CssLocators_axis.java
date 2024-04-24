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
        //System.out.println(driver.findElement(By.cssSelector("div[id=parent1] > div")).getText());

        //b. locating both direct children of Parent 1 only
        List<WebElement> parent1ChildList = driver.findElements(By.cssSelector("div[id=parent1] > div"));
//        System.out.println(parent1ChildList.size());
//        parent1ChildList.forEach(each -> System.out.println(each.getText()));

        //parent > child > sub-child > grand-child
        //NOTE: ClassTask1


        //2. Sub-child (any child)
        /**
         * parent child
         * tag[attr=value] tag[attr=value]
         */
        List<WebElement> list2 = driver.findElements(By.cssSelector("#parent1 > div"));
//        System.out.println(list2.size());
//        System.out.println(list2.get(1).getText());

        //locating all children of Parent 1 (4)
        List<WebElement> list3 = driver.findElements(By.cssSelector("#parent1 div"));
//        System.out.println(list3.size());
//        System.out.println("------");
//        System.out.println(list3.get(2).getText());

        //NOTE: No task

        //Nth-children
        //tag[attr=value]

        //locating first child of Child 3
        System.out.println(driver.findElement(By.cssSelector("div[id='parent2-child3'] > div")).getText());
        List<WebElement> list4 =  driver.findElements(By.cssSelector("div[id='parent2-child3'] > div"));
        System.out.println(list4.size());

        //tag[attr=value]:first-child
        //tagParent[attr=value]>div:first-child
        //tagParent[attr=value]>div[attr=value]:first-child
        List<WebElement> list5 = driver.findElements(By.cssSelector("div[id='parent2-child3'] > div:first-child"));
        System.out.println(list5.size());

        //locating last child of Child 3
        //tag[attr=value]:last-child
        //tagParent[attr=value]>div:last-child
        //tagParent[attr=value]>div[attr=value]:last-child
        driver.findElements(By.cssSelector("div[id='parent2-child3'] > div:last-child"));

        //locating 3rd child of Child 3
        //tag[attr=value]:nth-child(3)
        //tagParent[attr=value]>div:nth-child(3)
        //tagParent[attr=value]>div[attr=value]:nth-child(3)
        driver.findElements(By.cssSelector("div[id='parent2-child3'] > div:nth-child(3)"));

        //NOTE: ClassTask2


        driver.close();
    }
}
