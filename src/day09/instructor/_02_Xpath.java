package day09.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //working with texts (locating Select-class button on nav bar)
        //tag[@attr='value'] -> //a[@href='#/selectclass']
        //tag[text()='value'] -> //div[text()='test']

        driver.findElement(By.xpath("//a[text()='Select-class']"));

        //NOTE: ClassTask2

        //sub-strings of text - starts-with


        //sub-string of attribute - starts-with (print all links that starts-with 'Se')

        //NOTE: ClassTask3


        //sub-strings of text - contains


        //sub-string of attribute - contains


        driver.close();

        //NOTE: ClassTask4
    }
}
