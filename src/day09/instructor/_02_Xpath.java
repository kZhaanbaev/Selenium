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

        driver.findElement(By.xpath("//a[text()='Select-Class']"));

        //NOTE: ClassTask2

        //sub-strings of text - starts-with
        //xpath locator -> //tag[starts-with(text(), 'value')]
        driver.findElement(By.xpath("//a[starts-with(text(),'Select')]"));


        //sub-string of attribute - starts-with (print all links that starts-with 'Se')
        //tag[attr^=value] -> css locator
        driver.findElement(By.xpath("//a[starts-with(@class,'navbar')]"));

        //NOTE: ClassTask3


        //sub-strings of text - contains
        //tag[attr*=value] -> css locator
        //xpath -> //tag[contains(text(), 'value')]
        driver.findElement(By.xpath("//a[contains(text(), '-')]"));


        //sub-string of attribute - contains
        //tag[contains(@attr, 'value)]
        driver.findElement(By.xpath("//a[contains(@href, 'www')]"));


        driver.close();

        //NOTE: ClassTask4

        //ends-with option with css locator
        //tag[attr$=value]
    }
}
