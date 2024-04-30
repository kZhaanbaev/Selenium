package day11.student;

import _utils.Driver;
import org.openqa.selenium.WebDriver;


public class ClassTask2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.edclub.com/");

        //1. Click on 'Log in' button


        //2. Print out both section headers: Individual Edition, School Edition


        //3. Click on 'Individual Edition' option


        //4. Print button texts :
        //a. Log in with Google
        //b. Log in with Clever
        //c. Log in with Office 365


        //5. Fill out username and password field with a text 'test'


        //6. Verify 'Username and/or Password is wrong.' text has appeared.


        driver.close();
    }
}
