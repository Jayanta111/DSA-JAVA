import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 7, 8, 1, 2, 3, 4, 6, 7, 1};
        System.out.println("Before Insertion Sort: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Insertion Sort: " + Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) { // Start from index 1
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) { // Compare with previous element
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
