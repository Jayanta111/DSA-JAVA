import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize the Scanner to read user input

        System.out.println("Before Changing");

        // Initialize the string array

        String[] str = {"Raju","Rohit"};
        System.out.println(Arrays.toString(str));
        change(str);
        System.out.println("After Changing");

        System.out.println(Arrays.toString(str));
    }
    static void change(String[] arr){
        arr[0]="Rahul";


    }
}
