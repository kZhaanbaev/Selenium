package day_19.instructor;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_BasicMathTest {
    @Test
    public void test01(){
        //creating a test data
        int num1 = 34;
        int num2 = 28;

        _01_BasicMath math = new _01_BasicMath();

        //capturing expected and actual data for add method
        int expectedSum = num1 + num2;
        int actualSum = math.add(num1, num2);

        //verification
        Assert.assertEquals(actualSum, expectedSum);
    }

    @Test
    public void test02() {
        int num1 = 34;
        int num2 = 28;

        _01_BasicMath math = new _01_BasicMath();

        int expectedSub = num1 - num2;
        int actualSub = math.subtract(num1, num2);

        //verification
        Assert.assertEquals(actualSub, expectedSub);
    }
}
