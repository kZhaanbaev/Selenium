package day_21.instructor;

import org.testng.Assert;
import org.testng.annotations.Test;

//NOTE: ReadMe file first
public class __01_TDD {
    //Test Driven Development

    /*
    TDD stands for Test-Driven Development.
    It is a software development approach where tests are written first, before the actual code is written.
    The purpose of writing tests first is to define the behavior and requirements of the code,
    and to ensure that it works as expected. The code is then written to make the tests pass,
    and the process is repeated until the desired functionality achieved.
    This approach helps to catch bugs early in the development process,
    and leads to more maintainable and reliable code.
     */

    /**
     * 1. write a test case(s) first and then create functionality
     *      Need a functionality that takes a letter and a sentence then
     *      counts how many times that letter was repeated in that sentence.
     *      a. create a test data and expected result
     *      b. create an object of the class and a method name that supposed to
     *      have the functionality implemented in
     *      c. Assert
     *      Note: method will be red initially since it doesn't exist, then we will
     *      create that method step by step to remove red errors.
     */

    @Test
    public void test01(){
        String testText = "Tech Lead Academy";
        String testLetter = "a";
        int expectedCountA = 3;

        __01_TDD data = new __01_TDD();
        int actualCountA = data.getCountOfLetters(testLetter, testText);

        Assert.assertEquals(actualCountA, expectedCountA);
    }

    public int getCountOfLetters(String letter, String text){
        int count = 0;
        String[] arr = text.split("");
        for (String each: arr){
            if (each.equalsIgnoreCase(letter))
                count++;
        }
        return count;
    }

}
