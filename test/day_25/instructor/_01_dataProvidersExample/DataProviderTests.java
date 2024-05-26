package day_25.instructor._01_dataProvidersExample;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DataProviderTests {
    @DataProvider(name = "inputText")
    public Object[] data(){
        Object[] arr = {
                "Java is hard",
                "It's possible to get better in Java",
                "I have to try harder to get better"
        };
        return arr;
    }

    @Test(testName = "US101: Verify Input message", dataProvider = "inputText")
    public void test01(String text){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/inputs");
        driver.findElement(By.id("message")).sendKeys(text);
        driver.findElement(By.name("button1")).click();
        Assert.assertEquals(driver.findElement(By.name("message1")).getText(), text);
        Driver.closeDriver();
    }

    @DataProvider(name = "details")
    public Object[][] data2(){
        Object[][] arr = new Object[3][5];
        arr[0][0] = "John";
        arr[0][1] = "Smith";
        arr[0][2] = "123-456-7890";
        arr[0][3] = "john-smith@test.com";
        arr[0][4] = "Instructor";

        arr[1][0] = "Jess";
        arr[1][1] = "White";
        arr[1][2] = "123-432-4453";
        arr[1][3] = "jess-white@test.com";
        arr[1][4] = "Mentor";

        arr[2][0] = "Amanda";
        arr[2][1] = "Simpson";
        arr[2][2] = "444-456-2321";
        arr[2][3] = "amanda-simpson@test.com";
        arr[2][4] = "Student";

        return arr;
    }

    @Test(testName = "US301: Verify Instructor registration", dataProvider = "details")
    public void test02(String first, String last, String phone, String email, String role){
        WebDriver driver = Driver.getDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/?#/usermgt");
        driver.findElement(By.id("Firstname")).sendKeys(first);
        driver.findElement(By.id("Lastname")).sendKeys(last);
        driver.findElement(By.id("Phonenumber")).sendKeys(phone);
        driver.findElement(By.id("Email")).sendKeys(email);

        new Select(driver.findElement(By.id("Select-role"))).selectByVisibleText(role);
        driver.findElement(By.id("submit-btn")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//tbody/tr")).isDisplayed());
        Driver.closeDriver();
    }

    @DataProvider
    public Object[][] data3(){
        Object[][] arr = new Object[3][5];
        arr[0][0] = "Rhaenyra";
        arr[0][1] = "Targaryen";
        arr[0][2] = "queen.rhaenyra@7kingdoms.rule";
        arr[0][3] = "rhaenyra.targaryen$";
        arr[0][4] = "Instructor";

        arr[1][0] = "Daemon";
        arr[1][1] = "Targaryen";
        arr[1][2] = "prince.daemon@7kingdoms.rule";
        arr[1][3] = "daemon.targaryen$";
        arr[1][4] = "Mentor";

        arr[2][0] = "Aegon III";
        arr[2][1] = "Targaryen";
        arr[2][2] = "king.aegon@7kingdoms.rule";
        arr[2][3] = "aegon.targaryen$";
        arr[2][4] = "Student";

        return arr;
    }

    @Test(testName = "Login Test", dataProvider = "data")
    public void test03(String first, String last, String email, String password, String role) {
        WebDriver driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://selenium-practice-app.herokuapp.com/?#/usermgt");
        driver.findElement(By.linkText("LOGIN")).click();

        Set<String> windows = driver.getWindowHandles();
        for (String each: windows){
            if (!each.equals(driver.getWindowHandle()))
                driver.switchTo().window(each);
        }

        driver.findElement(By.name("username")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.tagName("button")).click();

        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), role + " Portal");
        Assert.assertEquals(driver.findElement(By.tagName("h4")).getText(),
                "Welcome, " + first + " " + last.charAt(0));

        Driver.quitDriver();
    }
}
