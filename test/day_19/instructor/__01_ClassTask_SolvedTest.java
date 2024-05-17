package day_19.instructor;

import org.testng.Assert;
import org.testng.annotations.Test;

public class __01_ClassTask_SolvedTest {
    int num1 = 34;
    int num2 = 20;
    __01_ClassTask_Solved task = new __01_ClassTask_Solved();

    @Test
    public void test01(){
//        int num1 = 34;
//        int num2 = 20;
//        __01_ClassTask_Solved task = new __01_ClassTask_Solved();

        int expected = num1 * num2;
        int actual = task.multiply(num1, num2);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test02(){
        double expected = (double)num1 / (double)num2;
        double actual = task.divide(num1, num2);
        Assert.assertEquals(actual, expected);
    }
}
