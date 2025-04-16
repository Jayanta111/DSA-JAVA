import java.util.Arrays;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {90, 75, 18, 12, 6, 4, 3, 1};
        int target = 4;

        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Find whether it's sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If the target is found, return the index
            if (arr[mid] == target) {
                return mid;
            }

            // If the array is sorted in ascending order
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // If the array is sorted in descending order
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        // If the target is not found, return -1
        return -1;
    }
}
