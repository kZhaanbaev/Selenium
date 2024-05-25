package day_23.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class _04_ClassTask_Solved {

    /**
     * Create a method fillOutRegistrationForm() that takes 5 parameters:
     * First Name, Last Name, Phone Number, Email and Role
     * Using these parameters method should fill out the form and submit
     */

    public void fillOutRegistrationForm(String first, String last, String phone, String email, String role){
        WebDriver driver = Driver.getDriver();
        driver.findElement(By.id("Firstname")).sendKeys(first);
        driver.findElement(By.id("Lastname")).sendKeys(last);
        driver.findElement(By.id("Phonenumber")).sendKeys(phone);
        driver.findElement(By.id("Email")).sendKeys(email);

        new Select(driver.findElement(By.id("Select-role"))).selectByVisibleText(role);
        driver.findElement(By.id("submit-btn")).click();
    }

}
