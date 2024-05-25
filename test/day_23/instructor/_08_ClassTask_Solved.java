package day_23.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class _08_ClassTask_Solved {
    /**
     * NOTE: Create a Test and use dataProvider to test 3 different users/roles
     *
     * 1. Navigate to https://selenium-practice-app.herokuapp.com/?#/usermgt
     * 2. Click on 'Login' button
     * 3. Login as a user (Student, Instructor or Mentor)
     * 4. Verify Welcome message is "Welcome, FirstName FirstLetterOfLastName"
     * 5. Verify header is "Role Portal"
     *
     * Examples:
     *      a. Rhaenyra Targaryen (Instructor)
     *          -> "Welcome, Rhaenyra T"
     *          -> Instructor Portal
     *      b. Daemon Targaryen (Mentor)
     *          -> "Welcome, Daemon T"
     *          -> Mentor Portal
     *      c. Aegon III Targaryen (Student)
     *          -> "Welcome, Aegon T"
     *          -> Student Portal
     */
    @DataProvider
    public Object[][] data(){
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
    public void test01(String first, String last, String email, String password, String role) {
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
