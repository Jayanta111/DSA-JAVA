import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 9, 4, 3, 1, 2, 5, 7};
            System.out.println("Before Bubble Sort: " +Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println("After Sorting : " +Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Optimization: check if swapping happens
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped, break (already sorted)
            if (!swapped) break;
        }
    }
}
