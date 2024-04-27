package day09.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Xpath {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/home");
        //locating header of the page

        //tag + attribute
        //tag[@attr='value'] -> //div[class=value] -> //h1[@id='title'] -> //h1[@name='h1-text']
        System.out.println(driver.findElement(By.xpath("//h1[@id='title']")).getText());

        //tag + attribute + attribute
        //tag[@attr='value'][@attr2='value2']
        //h1[@name='h1-text'][@class='header-text']
        driver.findElement(By.xpath("//h1[@name='h1-text'][@class='header-text']"));


        //asterisk *
        //*[@attr='value']
        driver.findElement(By.xpath("//*[@class='text']"));


        driver.close();

        //NOTE: ClassTask1

    }
}
