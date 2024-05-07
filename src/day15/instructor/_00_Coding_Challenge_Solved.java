package day15.instructor;

public class _00_Coding_Challenge_Solved {
    /**
     * Write a method that takes an array of names as a parameter.
     * Method should find all names that starts with a letter A and
     * has 6 or more letters in it.
     * Method should return all found names as an array.
     */
    public static void main(String[] args) {
        //test data
        String[] names = {"John", "Adam", "Samantha", "Bishop", "Amanda", "Sam", "Michael", "Jess", "Alex"};

        for(String each: getCustomName(names)){
            if (each != null){
                System.out.println(each);
            }
        }
    }

    public static String[] getCustomName(String[] arr){
        String[] resultArr = new String[arr.length];

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i].startsWith("A") && arr[i].length() >= 6) {
                resultArr[count] = arr[i];
                count++;
            }
        }
        return resultArr;
    }
}
