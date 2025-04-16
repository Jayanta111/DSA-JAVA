public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 1;
        System.out.println(Search(arr, target));  // Call the search function
    }

    // Function to perform the search in a rotated sorted array
    static int Search(int[] arr, int target) {
        int pivot = Pivot(arr);

        // If no pivot is found, the array is not rotated, so perform a standard binary search
        if (pivot == -1) {
            return BinarySearch(arr, target, 0, arr.length - 1);
        }

        // If the target is at the pivot, return the pivot index
        if (arr[pivot] == target) {
            return pivot;
        }

        // If the target is greater than the first element, it must be in the left part
        if (arr[0] <= target) {
            return BinarySearch(arr, target, 0, pivot - 1);
        }

        // Otherwise, the target must be in the right part
        return BinarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    // Standard binary search
    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If the target is found, return its index
            if (arr[mid] == target) {
                return mid;
            }

            // If the target is smaller, search in the left half
            if (arr[mid] > target) {
                end = mid - 1;
            }
            // If the target is larger, search in the right half
            else {
                start = mid + 1;
            }
        }
        // Return -1 if the target is not found
        return -1;
    }

    // Function to find the pivot in the rotated array
    static int Pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if the mid element is the pivot point
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // If the middle element is greater than the first element, the pivot is to the right
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            }
            // Otherwise, the pivot is to the left
            else {
                end = mid - 1;
            }
        }

        // If no pivot is found, return -1
        return -1;
    }
}
