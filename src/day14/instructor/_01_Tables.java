package day14.instructor;

import _utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Tables {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();

        driver.get("https://selenium-practice-app.herokuapp.com/#/tables");

        //Print out all emails


        //Print out all first names


        //Print out all first names with emails


        //Print out all first names with emails but as groups, retrieve data separately from each row.


        //Task: Print out value of First names based on if gender is Male (in Tables page)



        driver.close();


        //Class Task 1
    }
}
