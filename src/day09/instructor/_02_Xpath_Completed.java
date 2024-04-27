package day09.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_Xpath_Completed {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io");

        //working with texts
        /**
         * //tag[text()='value']
         *
         * Example: locating Select-class button using visible text
         * //a[text()='Select-class']
         */

        /**
         * Task: print out href value of saucedemo link on homepage using text() option of xpath
         * result: href="http://www.saucedemo.com/"
         */

//        System.out.println(driver.findElement(By.xpath("//a[text()='Saucedemo']")).getText());
//        System.out.println(driver.findElement(By.xpath("//a[text()='Saucedemo']")).getAttribute("href"));


        //sub-strings of text - starts-with
        /**
         * css -> div[class^=http]
         * xpath -> //tag[starts-with(text(),'Select-class')]
         *
         * Example: //a[starts-with(text(), 'Se')]
         */

        List<WebElement> list = driver.findElements(By.xpath("//a[starts-with(text(), 'Se')]"));
        //list.forEach(each -> System.out.println(each.getText()));

        //sub-string of attribute - starts-with
        /**
         * xpath -> //a[starts-with(@class, 'value')]
         *
         * Task: print out text of all links that has href attribute value starting with "https"
         */

        List<WebElement> list2 = driver.findElements(By.xpath("//a[starts-with(@href, 'https')]"));
        //list2.forEach(each -> System.out.println(each.getText()));


        //sub-strings of text - contains
        /**
         * css -> tag[attr*=value] -> div[class*=blue]
         * xpath -> //tag[contains(text(), 'value')]
         *
         * Example: locate all buttons and links that contain "-" in it's text
         * //a[contains(text(), '-')]
         */


        //sub-string of attribute - contains
        /**
         * Task: locate all links that contains "www" in the href attribute
         */

        List<WebElement> list3 = driver.findElements(By.xpath("//a[contains(@href, 'www')]"));
        list3.forEach(each -> System.out.println(each.getText()));


        driver.close();

        //NOTE: ClassTask2
    }
}
