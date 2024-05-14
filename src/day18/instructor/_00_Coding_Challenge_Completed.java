package day18.instructor;

public class _00_Coding_Challenge_Completed {
    /**
     * Time to complete: 15 min
     * Write a program that takes a number and prints out each digit separately.
     * Example: 4501 -> prints out 4, 5, 0, 1
     */
    public static void main(String[] args) {
        printDigits(35482);
    }

    public static void printDigits(int number){
        int length = String.valueOf(number).length();
        int totalZeros = (int)Math.pow(10, length) / 10;

        for (int i = 0; i < length; i++){
            System.out.println(number / totalZeros);
            number = number - number /totalZeros * totalZeros;
            totalZeros /= 10;
        }
    }
}
