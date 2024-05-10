package day16.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class __03_ClassTask_Solved {
    /**
     *  Duration: 25min
     *  1. Navigate to url "https://jira.ivorreic.com/project/board"
     * 	2. Grab first Task under Backlog column and move to In Progress column
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://jira.ivorreic.com/project/board");
        Thread.sleep(20000);

        WebElement source = driver.findElement(By.xpath("//a[@data-testid='list-issue']"));
        WebElement target = driver.findElement(By.xpath("//div[@data-testid='board-list:inprogress']"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();

        Thread.sleep(3000);

        driver.close();
    }
}
