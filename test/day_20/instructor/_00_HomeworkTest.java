package day_20.instructor;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _00_HomeworkTest {
    /**
     *
     *  1. method returnInitialsInCaps()
     *      Create a method with above name
     *      Method should accept 1 String argument
     *      It should return all initials in caps only
     *      Example: Input -> tech lead Academy
     *              returns -> TLA
     *
     *  2. Create tests to verify if the method is working as expected.
     *      Test methods should be place in new _02_ClassTaskTest class.
     *      Reminder: You can create multiple test cases with different test data.
     *      Create at least 4 test cases with following data.
     *      Example:
     *          1. "Tech Lead Academy"
     *          2. " Google " (notice a space in the beginning and in the end)
     *          3. null
     *          4. " " (just an empty space)
     */
    _00_Homework homework = new _00_Homework();

    @Test
    public void test01(){
        String data = "Tech Lead Academy";
        String expectedResult = "TLA";
        String actualResult = homework.returnInitialsInCaps(data);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test02(){
        String data = " Google ";
        String expectedResult = "G";
        String actualResult = homework.returnInitialsInCaps(data);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test03(){
        String data = null;
        String expectedResult = "";
        String actualResult = homework.returnInitialsInCaps(data);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test04(){
        String data = " ";
        String expectedResult = "";
        String actualResult = homework.returnInitialsInCaps(data);
        Assert.assertEquals(actualResult, expectedResult);
    }

}
