public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9};
        int target = 18;

        // Print whether the target exists in the array
        System.out.println("Target found: " + linearSearch(arr, target, 0));

        // Print the index of the target
        int index = findIndex(arr, target, 0);
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found in the array.");
        }
    }

    static boolean linearSearch(int[] arr, int target, int i) {
        if (i == arr.length) { // Fixed condition to check the end of the array
            return false;
        }
        return arr[i] == target || linearSearch(arr, target, i + 1);
    }

    static int findIndex(int[] arr, int target, int i) {
        if (i == arr.length) { // Fixed condition to check the end of the array
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return findIndex(arr, target, i + 1);
    }
}
