package day11.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ClassTask1_Solved {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.edclub.com/");

        //1. Print out title of the page
        //System.out.println(driver.getTitle());

        //2. Print out nav buttons' text -> Library, School Edition, Products
        Thread.sleep(1000);
        List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='nav-start']/*[starts-with(@role, 'menu')]"));
        //list1.forEach(each -> System.out.println(each.getText()));

        //3. Print out small headers -> Effective Learning, Powerful Teaching, Unleashed Creating
        List<WebElement> list2 = driver.findElements(By.xpath("//h5"));
        list2.forEach(each -> System.out.println(each.getText()));

        //4. Print out section headers :
        //a. Digital citizenship
        //b. Social Emotional learning
        System.out.println(driver.findElement(By.xpath("(//div[@class='info'])[3]/h3")).getText());
        System.out.println(driver.findElement(By.xpath("(//div[@class='info'])[4]/h3")).getText());


        //5. Print out text of 'alt' attributes of each logo under 'Trusted by 50K+ institutions section



        driver.close();
    }
}
