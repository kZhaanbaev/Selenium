package day16.instructor;

import _utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_ActionsClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/actionclass");

        //selecting a text that was entered by a user (Ctrl + A command)


        //copy above selected text and paste in other place (Ctrl + C and Ctr + V commands)



        /**
         * Reading tooltips:
         * Tooltips with attribute values
         *  - With "title" attribute (youtube.com)
         *  - With "data-tip" attribute on Action-class page
         */


        //2. With hover over method (Actions page)


        //Print without hovering over first


        //Print with hover over using Actions class



        //Class Task 2

        Thread.sleep(3000);
        driver.close();
    }
}
