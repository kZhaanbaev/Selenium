package day07.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

//https://chicken-learn-s33.craft.me/6KjOiP5cRrDWNX
public class _00_HomeworkReview {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://computer-database.gatling.io/computers");

        String testComputer = "Apple Macbook Pro";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String currentDate = LocalDate.now().format(formatter);

        driver.findElement(By.cssSelector("#add")).click();
        driver.findElement(By.cssSelector("#name")).sendKeys(testComputer);
        driver.findElement(By.cssSelector("#introduced")).sendKeys(currentDate);
        driver.findElement(By.cssSelector("input[class='btn primary']")).click();

        String expectedText = "Done ! Computer Apple Macbook Pro has been created";
        String confirmationText = driver.findElement(By.cssSelector("div[class='alert-message warning']")).getText();
        if (confirmationText.equalsIgnoreCase(expectedText)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.findElement(By.cssSelector("#searchbox")).sendKeys(testComputer);
        driver.findElement(By.cssSelector("#searchsubmit")).click();

        List<WebElement> list = driver.findElements(By.cssSelector("a[href^='/computers/']"));

        String result = "FAIL";
        for(WebElement each: list){
            if (each.getText().equalsIgnoreCase(testComputer)){
                result = "PASS";
                return;
            }
        }
        System.out.println(result);

        driver.close();
    }
}
