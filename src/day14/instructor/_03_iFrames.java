package day14.instructor;

import _utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_iFrames {
    //NOTE: README.md file
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-practice-app.herokuapp.com/#/iframes");

        //access TLA website and print main text "Hello! I am the parent iFrame without switching

        //access parent iFrame and print text again with switching

        //access child iFrame - budget calc
        // input Transaction name and amount

        //access child iFrame - wiki
        //  print listed languages

        //navigation from one iframe to another, child to parent, etc.

        //Class Task 2
    }
}
