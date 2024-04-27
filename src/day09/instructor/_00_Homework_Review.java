package day09.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _00_Homework_Review {
    /**
     * 1. Navigate to http://code-vista.net/home
     * 2. Input following credentials and login:
     *      username: tla.liveproject.team1@gmail.com
     *      password: b2e842cb-df29-46a9-b54a-23a2b0a22ccc
     * 3. Open each module and validate following:
     *      If there are assignments in the module, print out number of tasks as:
     *          "Module 'Casting' has 4 tasks"
     *      If there is no any assignment in the module, print out as:
     *          "Module 'Casting' does not have any tasks"
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("http://code-vista.net/home");

        //login
        driver.findElement(By.cssSelector("#form3Example3")).sendKeys("tla.liveproject.team1@gmail.com");
        driver.findElement(By.cssSelector("#form3Example4")).sendKeys("b2e842cb-df29-46a9-b54a-23a2b0a22ccc");
        driver.findElement(By.cssSelector("button[class='btn btn-primary btn-lg']")).click();

        Thread.sleep(1000);
        //locating all modules
        List<WebElement> modulesList = driver.findElements(By.cssSelector(".box"));

        //iterating through each module
        for (int i = 0; i < 12; i++){
            Thread.sleep(500);
            modulesList = driver.findElements(By.cssSelector(".box"));

            String moduleName = modulesList.get(i).getText();
            modulesList.get(i).click();

            Thread.sleep(500);

            //locating number of all assignments in each module
            List<WebElement> assignments = driver.findElements(By.cssSelector(".list-group"));

            //checking if there is any assignment and printing based on that
            if (!assignments.isEmpty()){
                System.out.println("Module '" + moduleName + "' has " + assignments.size() + " tasks");
            }else {
                System.out.println("Module '" + moduleName + "' does not have any tasks");
            }

            //navigating back to the main page
            driver.navigate().back();
        }

        driver.close();
    }
}
