public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2; // Define the value of m
        System.out.println(splitArray(nums, m));
    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        // Calculate start (max element) and end (sum of all elements)
        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        // Binary search for the minimum largest sum
        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num; // Start a new subarray
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; // This is the minimum largest sum possible
    }
}
