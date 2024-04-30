package day11.student;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ClassTask1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.edclub.com/");

        //1. Print out title of the page


        //2. Print out nav buttons' text -> Library, School Edition, Products


        //3. Print out small headers -> Effective Learning, Powerful Teaching, Unleashed Creating


        //4. Print out section headers :
        //a. Digital citizenship
        //b. Social Emotional learning


        //5. Print out text of 'alt' attributes of each logo under 'Trusted by 50K+ institutions section



        driver.close();
    }
}
