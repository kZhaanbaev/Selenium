package day14.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_Tables {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();

        driver.get("https://selenium-practice-app.herokuapp.com/?#/tables");

        //Print out all emails
        List<WebElement> emails = driver.findElements(By.xpath("//td[6]"));
        //emails.forEach(each -> System.out.println(each.getText()));


        //Print out all first names
        List<WebElement> firstNames = driver.findElements(By.xpath("//td[1]"));

        //Print out all first names with emails
        for(int i = 0; i < emails.size(); i++){
            //System.out.println(firstNames.get(i).getText() + " : " + emails.get(i).getText());
        }

        //Print out all first names with emails but as groups, retrieve data separately from each row.
        List<WebElement> tRows = driver.findElements(By.xpath("//tbody/tr"));

        System.out.println(tRows.get(0).getText());
        System.out.println(tRows.get(0).findElement(By.xpath("./td[1]")).getText());

        //Task: Print out value of First names based on if gender is Male (in Tables page)



        driver.close();


        //Class Task 1
    }
}
