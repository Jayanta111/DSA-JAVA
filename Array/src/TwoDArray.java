import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        // Initialize Scanner to read input
        Scanner in = new Scanner(System.in);

        // Create a 2D array of size 3x2
        int[][] arr = new int[3][2];

        // Read input values for the 2D array
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                System.out.println("Enter value for arr[" + row + "][" + col + "]:");
                arr[row][col] = in.nextInt();
            }
        }

        System.out.println("The 2D array is:");
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // Close the scanner
        in.close();
    }
}
