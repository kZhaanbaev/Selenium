package day_19.instructor;

public class _01_BasicMath {
    /**
     *  0. NOTE: ReadMe file
     *
     *  1. Create 2 methods to handle basic math calculations
     *      add, subtract.
     *  2. Validate all 4 methods in main method with if statements
     *  3. Validate with TestNG (add() and subtract() methods only)
     *  4. Class Task 1
     */

    public static void main(String[] args) {
        //creating a test data
        int num1 = 34;
        int num2 = 28;

        _01_BasicMath math = new _01_BasicMath();

        //capturing expected and actual data for add method
        int expectedSum = num1 + num2;
        int actualSum = math.add(num1, num2);

        //verification
        if (expectedSum == actualSum){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

        //capturing expected and actual data for subtract method
        int expectedSub = num1 - num2;
        int actualSub = math.subtract(num1, num2);

        //verification
        if (expectedSub == actualSub){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

}
