package _utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver = null;

    public static WebDriver getDriver() {
        if (driver == null){
            System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void moveIntoViewWithJsExecutor(WebElement element){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView(true)", element);
    }

    public static void highlightElement(WebElement element){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        for (int i = 0; i < 4; i++){
            if (i % 2 == 0){
                sleep(500);
                jsExecutor.executeScript("arguments[0].setAttribute('style','border: solid 2px red');", element);
                jsExecutor.executeScript("arguments[0].style.backgroundColor='yellow'", element);
            }else {
                sleep(500);
                jsExecutor.executeScript("arguments[0].setAttribute('style','border: none');", element);
                jsExecutor.executeScript("arguments[0].style.backgroundColor=null", element);
            }
        }
    }

    public static void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
