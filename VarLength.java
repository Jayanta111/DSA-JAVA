import java.util.Arrays;

public class VarLength {
    public static void main(String[] args) {
        // Call the fun() method with a varargs parameter
        fun(2, 5, 6, 4, 9, 7, 1, 0, 10);
    }

    // Method to accept variable length arguments
    static void fun(int... v) {
        System.out.println(Arrays.toString(v));  // Prints the array of numbers passed
    }
}
