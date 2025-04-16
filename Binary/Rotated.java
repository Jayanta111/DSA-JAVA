package Binary;

public class Rotated {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        int target = 8;
        System.out.println(Search(arr, target, 0, arr.length - 1));
    }

    static int Search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1; // Base case: target not found
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid; // Target found
        }

        // Check if the left half is sorted
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return Search(arr, target, start, mid - 1); // Search in the left half
            } else {
                return Search(arr, target, mid + 1, end); // Search in the right half
            }
        }

        // Otherwise, the right half must be sorted
        if (target >= arr[mid] && target <= arr[end]) {
            return Search(arr, target, mid + 1, end); // Search in the right half
        } else {
            return Search(arr, target, start, mid - 1); // Search in the left half
        }
    }
}