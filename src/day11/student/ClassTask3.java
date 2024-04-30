package day11.student;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ClassTask3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://app.swaggerhub.com/apis-docs/oceanbluetest/InterveiwPrep/1.0.0#/");

        //0. Verify link of 'Apache 2.0' text is 'http://www.apache.org/licenses/LICENSE-2.0.html'


        //1. Print out HTTP request names only


        //2. Print out HTTP request resources only, for example: /userLogin or /topic


        //3. Print out descriptions of all HTTP requests




        driver.close();
    }
}
