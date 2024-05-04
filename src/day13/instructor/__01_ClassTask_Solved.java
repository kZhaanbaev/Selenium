package day13.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class __01_ClassTask_Solved {
    /**
     *  URL: https://selenium-practice-app.herokuapp.com/#/popup
     *  1. Click on "BMI Calculator" button
     *  2. Input height and weight
     *  3. Click on "Calculate" button
     *  4. Print out BMI Result
     *  5. Print out which category it belongs to
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/#/popup");

        driver.findElement(By.id("bmi_btn")).click();

        Thread.sleep(1000);

        driver.findElement(By.name("feet")).sendKeys("5");
        driver.findElement(By.name("inch")).sendKeys("10");
        driver.findElement(By.name("weight")).sendKeys("150");
        driver.findElement(By.id("calculate_btn")).click();

        String result = driver.findElement(By.id("BMI_result")).getText();
        System.out.println(result);
        driver.close();

        double weight = Double.parseDouble(result);

        if (weight < 18.5){
            System.out.println("Underweight");
        }else if (weight < 25){
            System.out.println("Normal weight");
        }else if (weight < 30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
