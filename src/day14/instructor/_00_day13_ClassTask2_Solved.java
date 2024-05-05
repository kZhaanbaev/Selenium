package day14.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _00_day13_ClassTask2_Solved {
    /**
     *
     *  URL: "https://selenium-practice-app.herokuapp.com/#/multiplewindow"
     *  1. Print out texts of each button on the page (Launch TLA, Launch Google, Launch Facebook)
     *  2. Click on "Launch Facebook"
     *  3. Print out text "Connect with friend and the world..."
     *  4. Close facebook window
     *  5. Return to the main window
     *  7. Click on "Launch Google" button
     *  8. Print out title of the page
     *  9. Click on "Launch TLA"
     *  10. Print out text of navigation buttons
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();

        //1
        driver.get("https://selenium-practice-app.herokuapp.com/#/multiplewindow");

        //2
        driver.findElement(By.linkText("Launch Facebook")).click();

        //3
        String mainPageID = driver.getWindowHandle();
        Set<String> allIds = driver.getWindowHandles();
        for (String eachId: allIds){
            if (!eachId.equals(mainPageID)){
                driver.switchTo().window(eachId);
            }
        }

        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("h2")).getText());

        //4
        driver.close();

        //5
        driver.switchTo().window(mainPageID);

        //7
        driver.findElement(By.linkText("Launch Google")).click();

        //8
        allIds = driver.getWindowHandles();
        for (String eachId: allIds){
            if (!eachId.equals(mainPageID)){
                driver.switchTo().window(eachId);
            }
        }

        Thread.sleep(2000);
        System.out.println(driver.getTitle());

        //9
        driver.switchTo().window(mainPageID);
        driver.findElement(By.linkText("Launch TLA")).click();

        //10
        allIds = driver.getWindowHandles();
        for (String eachId: allIds){
            driver.switchTo().window(eachId);
            if (driver.getTitle().equals("Coding Boot-camp | Tech Lead Academy")){
                driver.manage().window().maximize();
                Thread.sleep(2000);
                List<WebElement> list = driver.findElements(By.xpath("//div[@id='lp-pom-box-346']//a[not(@class)]"));
                list.forEach(each -> System.out.println(each.getText()));
            }
        }
    }
}
