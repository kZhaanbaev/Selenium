package day10.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Xpath {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/home");

        //parent -> child
        //css locator: tag[attr=value] > #id
        //xpath: //tag[@attr='value]/childTag[childAttr='value']
        //use single / for locating direct children
        System.out.println(driver.findElement(By.xpath("//div[@class='home-page']/a")).getText());

        driver.findElement(By.xpath("//div[@id='parent2']/div"));

        //parent -> all children
        //css -> tag[attr=value] #id
        //xpath: //tag[@attr='value]//childTag[childAttr='value']
        //use // for all children regardless the level
        driver.findElement(By.xpath("//div[@id='parent2']//div"));


        //indexes [n] -> to get specific child or element
        //tag[@attr='value'][index]
        driver.findElement(By.xpath("//div[@class='parent'][2]"));
        driver.findElement(By.xpath("(//a[@class='navbar-brand ml-3'])[16]"));


        //keywords: last(), last()-n
        driver.findElement(By.xpath("(//a[@class='navbar-brand ml-3'])[last()]"));
        driver.findElement(By.xpath("(//a[@class='navbar-brand ml-3'])[last()-3]"));

        //and, or keywords in xpath
        //tag[@attr='value][@attr2='value2'] -> //tag[@attr='value' and @attr2='value2']
        //a[contains(text(),'Sign in') and starts-with(@class, 'HeaderMenu')]

        //using 'or' keyword
        //tag[@attr='value' or @attr2='value2']

        driver.close();

        //NOTE: ClassTask1
    }
}
