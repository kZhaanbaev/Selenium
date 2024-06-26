package day_20.instructor;

public class _00_Homework {
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

    public String returnInitialsInCaps(String str){
        if (str == null || str.equals(" "))
            return "";

        String[] arr = str.trim().split(" ");
        String initials = "";
        for (String each: arr){
            initials += each.charAt(0);
        }

        return initials.toUpperCase();
    }


}
