package day13.instructor;

public class _00_Coding_Challenge_Solved {
    /**
     * Create a method that takes a String argument.
     * Method should return only initials in caps.
     * Example: input: "tech Lead academy" -> output: TLA
     * Example: input: "I like to jump" -> "ILTJ"
     */
    public static void main(String[] args) {
        System.out.println(getInitials("tech Lead academy"));
        System.out.println(getInitials("I like to jump"));
    }

    public static String getInitials(String str) {
        String[] arr = str.split(" ");
        String caps = "";

        for(String each: arr){
            caps += each.charAt(0);
        }

        return caps.toUpperCase();
    }


}
