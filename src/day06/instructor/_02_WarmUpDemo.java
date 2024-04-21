package day06.instructor;

import _utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_WarmUpDemo {
    //0. Inputs page on practice website
    //1. Create an array of String with test data
    //2. Capture all input elements using common locator of the form
    //3. Input test data above using loop
    public static void main(String[] args) throws InterruptedException {
        Driver.getDriver().get("https://selenium-practice-app.herokuapp.com/#/inputs");

        String[] dataArr = {"John", "Smith", "john@test.com", "444-444-4444", "Address", "New York",
        "New York", "12345"};

        //will locate 3 extra elements from the above of the page
        List<WebElement> list = Driver.getDriver().findElements(By.cssSelector(".form-control"));

        for(int i = 3; i < list.size(); i++){
            Thread.sleep(1000);
            list.get(i).sendKeys(dataArr[i-3]);
        }

        Driver.getDriver().close();
    }

    //NOTE: ClassTask 1

}
