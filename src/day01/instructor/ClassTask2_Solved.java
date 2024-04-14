package day01.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask2_Solved {
    /**
     * 1. Create a method that takes a String parameter.
     * Method should return number of words String parameter has.
     * 2. Set up the driver in main method
     * 3. Open http://automation.techleadacademy.io
     *      - get title of the page and store in a variable
     *      - print out how many words does the title consist of
     *      - close the driver
     * 4. Open https://techleadacademy.io
     *      - get title of the page and store in a variable
     *      - print out how many words does the title consist of
     *      - close the driver
     * 5. Open https://amazon.com
     *      - get title of the page and store in a variable
     *      - print out how many words does the title consist of
     *      - close the driver
     * 6. Compare above titles and print out which one has the most letters
     */
    public static int getNumberOfWords(String str){
        return str.split(" ").length;
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-8/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium-practice-app.herokuapp.com/#/home");
        String title1 = driver.getTitle();
        System.out.println(title1);
        System.out.println(getNumberOfWords(title1));
        driver.close();

        driver = new ChromeDriver();
        driver.get("https://www.techleadacademy.io");
        String title2 = driver.getTitle();
        System.out.println(title2);
        System.out.println(getNumberOfWords(title2));
        driver.close();

        driver = new ChromeDriver();
        driver.get("https://amazon.com");
        String title3 = driver.getTitle();
        System.out.println(title3);
        System.out.println(getNumberOfWords(title3));
        driver.close();

        System.out.println("Step 6 result: ");
        if (getNumberOfWords(title1) > getNumberOfWords(title2)){
            if (getNumberOfWords(title1) > getNumberOfWords(title3)){
                System.out.println(title1);
            }else {
                System.out.println(title3);
            }
        }else {
            if (getNumberOfWords(title2) > getNumberOfWords(title3)){
                System.out.println(title2);
            }else {
                System.out.println(title3);
            }
        }

    }
}
