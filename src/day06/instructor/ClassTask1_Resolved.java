package day06.instructor;


import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ClassTask1_Resolved {
    /**
     * 	- Class Task: 25 min
     * 		○ 1. Navigate to "https://www.google.com/"
     * 		○ 2. Input "SDET positionS" in search bar
     * 		○ 3. Click on "Google search"
     * 		○ 4. Click on "100+ more jobs" option
     * 		○ 5. Print out names of companies that are hiring from the list
     */
    public static void main(String[] args) throws InterruptedException {
        Driver.getDriver().get("https://google.com");

        //2
        Driver.getDriver().findElement(By.cssSelector("#APjFqb")).sendKeys("SDET positions");

        //3
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.cssSelector("input[name=btnK]")).click();

        Thread.sleep(1000);
        Driver.getDriver().navigate().refresh();
        //4
        Driver.getDriver().findElement(By.cssSelector(".esVihe")).click();

        //5
        List<WebElement> list = Driver.getDriver().findElements(By.cssSelector(".vNEEBe"));
        list.forEach(each -> System.out.println(each.getText()));

        Thread.sleep(1000);
        Driver.getDriver().close();
    }



}
