package day_25.instructor._01_dataProvidersExample;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "inputText")
    public Object[] data(){
        Object[] arr = {
                "Java is hard",
                "It's possible to get better in Java",
                "I have to try harder to get better"
        };
        return arr;
    }

    @DataProvider(name = "details")
    public Object[][] data2(){
        Object[][] arr = new Object[3][5];
        arr[0][0] = "John";
        arr[0][1] = "Smith";
        arr[0][2] = "123-456-7890";
        arr[0][3] = "john-smith@test.com";
        arr[0][4] = "Instructor";

        arr[1][0] = "Jess";
        arr[1][1] = "White";
        arr[1][2] = "123-432-4453";
        arr[1][3] = "jess-white@test.com";
        arr[1][4] = "Mentor";

        arr[2][0] = "Amanda";
        arr[2][1] = "Simpson";
        arr[2][2] = "444-456-2321";
        arr[2][3] = "amanda-simpson@test.com";
        arr[2][4] = "Student";

        return arr;
    }

    @DataProvider
    public Object[][] data3(){
        Object[][] arr = new Object[3][5];
        arr[0][0] = "Rhaenyra";
        arr[0][1] = "Targaryen";
        arr[0][2] = "queen.rhaenyra@7kingdoms.rule";
        arr[0][3] = "rhaenyra.targaryen$";
        arr[0][4] = "Instructor";

        arr[1][0] = "Daemon";
        arr[1][1] = "Targaryen";
        arr[1][2] = "prince.daemon@7kingdoms.rule";
        arr[1][3] = "daemon.targaryen$";
        arr[1][4] = "Mentor";

        arr[2][0] = "Aegon III";
        arr[2][1] = "Targaryen";
        arr[2][2] = "king.aegon@7kingdoms.rule";
        arr[2][3] = "aegon.targaryen$";
        arr[2][4] = "Student";

        return arr;
    }
}
