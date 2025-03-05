import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 9, 7};

        // Before Swap
        System.out.println("Before Swap");
        System.out.println(Arrays.toString(arr));

        // After Swap
        System.out.println("After Swap");
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));

        // Before Reverse
        System.out.println("Before Reverse");
        System.out.println(Arrays.toString(arr));

        // After Reverse
        System.out.println("After Reverse");
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Method to swap elements in the array
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Method to reverse the entire array
    static void Reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);  // Swap elements at start and end
            start++;
            end--;
        }
    }
}
