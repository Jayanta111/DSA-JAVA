import java.util.Arrays;
import java.util.Scanner;

public class changeV {
    public static void main(String[] args) {
        int n = 5;
        String[] arr = new String[n];
        System.out.println("Enter Name:");

        // Use Scanner to take user input
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name for position " + (i+1) + ": ");
            arr[i] = in.nextLine();
        }

        change(arr);

        // Print the modified array
        System.out.println(Arrays.toString(arr));
    }

    static void change(String[] name) {
        name[0] = "Rohit";  // Change the first element to "Rohit"
    }
}
