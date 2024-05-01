package day11.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //xpath axis

        //immediate children
        //locating immediate children of Parent1 element
        //div[@id='parent1']/div
        //div[@id='parent1']/child::div



        //descendant
        //div[@id='parent1']//div
        //div[@id='parent1']/descendant::div


        //following -> all following webElements regardless the hierarchy, by giving the starting point
        //div[@id='parent1']/following::div


        //preceding -> all preceding webElements regardless the hierarchy, by giving the starting point
        //div[@id='parent1']/preceding::div


        //preceding-sibling
        //div[@id='parent1']/preceding-sibling::div
        //div[text()='Sub-child 3']/preceding-sibling::div


        //following-sibling
        //div[@id='parent1']/following-sibling::div
        //div[text()='Sub-child 3']/following-sibling::div


        //parent
        //div[@id='parent1-child1']/parent::div
        //div[text()='Sub-child 3']/parent::div


        //ancestor
        //div[text()='Sub-child 3']/ancestor::div[@class='parent']
        //div[@name='c-class']//ancestor::div[@id='mercedes']


        //using negation with 'not' keyword
        //tagName[@attr='value']
        //div[@class='child' and not(contains(@id, 'child2'))]
        //div[@class='child' and not(@id='parent1')]


        driver.close();

        //NOTE: ClassTask1

    }
}
