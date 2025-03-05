import java.util.Arrays;

public class twoD {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 6, 7, 8}, {1, 6, 9, 20}, {30, 40, 50, 60}};
        int target = 40;

        // Print the entire 2D array row by row
        System.out.println("The 2D array is:");
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));  // Print each row of the array
        }

        // Search for the target in the 2D array
        int[] ans = Search(arr, target);
        System.out.println("Target index is: " + Arrays.toString(ans));  // To print the array [row, col]
    }

    // Method to search for the target in the 2D array
    static int[] Search(int[][] arr, int target) {
        // Iterate through the rows and columns of the 2D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};  // Return the position [row, col]
                }
            }
        }
        // If not found, return [-1, -1]
        return new int[]{-1, -1};
    }
}
