public class Main {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 17, 50};
        int target = 17;
        int ans = linearSearch(arr, target);
        System.out.println("The Targeted element is "+target);
        System.out.println("The Target Element index is :" +ans);  // Output will be the index of 17
    }

    static int linearSearch(int[] arr, int target) {
        // To check whether array is empty or not
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;  // Return the index if target is found
            }
        }
        return -1;  // Return -1 if target is not found
    }
}
