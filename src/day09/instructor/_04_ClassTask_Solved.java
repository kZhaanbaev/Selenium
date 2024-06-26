package day09.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _04_ClassTask_Solved {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Use only xpath locators
         * 1. navigate to https://github.com/
         * 2. Click on Pricing nav button
         * 3. Print out all questions under "Frequently asked questions" section
         *
         * 4. Click on Sign in button from Pricing page
         * 5. Input "test@test.com" in email address field
         * 6. Input "test" in password field
         * 7. Click on "Sign in" button
         * 8. Verify a web element with text "Incorrect username or password." is displayed
         * Note: add Thread.sleep() - about 2-3 seconds if text doesn't show up fast enough
         */
        WebDriver driver = Driver.getDriver();
        driver.get("https://github.com");

        //click Pricing button
        driver.findElement(By.xpath("//a[starts-with(@class, 'HeaderMenu-link')][text()='Pricing']")).click();

        Thread.sleep(1000);

        //print out questions
        List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class, ' faq-mktg-item')]"));
        list.forEach(each -> System.out.println(each.getText()));

        //click on Sign in button from the main page
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')][starts-with(@class, 'HeaderMenu')]")).click();

        //input credentials
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test");

        driver.findElement(By.xpath("//input[@name='commit']")).click();

        //verify
        if (driver.findElement(By.xpath("//*[contains(text(), 'Incorrect username or password.')]")).isDisplayed()){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }


        driver.close();
    }
}
