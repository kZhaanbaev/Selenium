package day02.instructor;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask1_Solved {
    public static void main(String[] args) {
        /**
         * NOTE: Complete the task using navigate methods only
         * 1. Navigate to "https://asoftmurmur.com/"
         *      print out the title of the page
         * 2. Navigate to "https://agoodmovietowatch.com/"
         *      print out the url of the page
         * 3. Navigate back
         *      verify title contains a word "murmur"
         * 4. Refresh the page
         * 5. Navigate forward
         *      verify title ends with a word "Watch"
         */
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://asoftmurmur.com/");
        System.out.println(driver.getTitle());

        driver.get("https://agoodmovietowatch.com/");
        System.out.println(driver.getTitle());

        driver.navigate().back();
        String currentTitle = driver.getTitle();

        //Verification
        if (currentTitle.contains("Murmur")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.navigate().refresh();

        driver.navigate().forward();

        //Verification
        if (driver.getTitle().endsWith("Watch")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.close();
    }
}
