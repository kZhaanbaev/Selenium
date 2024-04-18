package day03.instructor;

public class JavaPractice_Solved {
    /**
     * Note: Create a method for each challenge below
     * 1. Basic: Find sum of elements in an array
     * 2. Basic: Print even and odd numbers from an array based on
     * what user wants to print out
     */

    public static void main(String[] args) {
        int[] testData = {2,4,3,2,4,5,6,3};

        //System.out.println(getSum(arr));
        //printOddOrEven(testData, "even");
    }

    //1. Basic: Find sum of elements in an array
    public static int getSum(int[] arr){
        int sum = 0;
        for(int each: arr){
            sum += each;
        }

        return sum;
    }

    //Print even and odd numbers from an array based on
    //what user wants to print out
    public static void printOddOrEven(int[] arr, String userInput){
        if (!userInput.equalsIgnoreCase("even") && !userInput.equalsIgnoreCase("odd")){
            System.out.println("Wrong input, please enter 'even' or 'odd' only.");
            return;
        }

        if (userInput.equalsIgnoreCase("even")){
            for (int num: arr){
                if (num % 2 == 0){
                    System.out.println(num);
                }
            }
        }else {
            for (int num: arr){
                if (num % 2 == 1){
                    System.out.println(num);
                }
            }
        }
    }
}
