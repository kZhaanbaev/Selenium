package day14.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class __01_A_ClassTask_Solved {
    //Task: Print out value of First names based on if gender is Male (in Tables page)
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();

        driver.get("https://selenium-practice-app.herokuapp.com/?#/tables");

        List<WebElement> list  = driver.findElements(By.xpath("//tbody/tr"));

        for(int i = 0; i < list.size(); i++){
            String gender = list.get(i).findElement(By.xpath("./td[3]")).getText();
            String firstName = list.get(i).findElement(By.xpath("./td[1]")).getText();

            if (gender.equals("Male"))
                System.out.println(firstName);
        }

        driver.close();

    }


}
