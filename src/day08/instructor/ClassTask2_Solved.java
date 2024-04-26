package day08.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassTask2_Solved {
    /**
     * On "Selectors" page
     * Under "Simple Selectors" section
     * Under "Choose your favorite Ball color" text
     * Click color Yellow
     * Verify text of "Your favorite color is:" matches to what you clicked
     */
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/#/selectors");

        driver.findElement(By.cssSelector("#ball > li:last-child")).click();

        WebElement element = driver.findElement(By.cssSelector("div[id=selectors-page]>div>div>.result "));

        if (element.getText().equals("Yellow")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.close();
    }
}
