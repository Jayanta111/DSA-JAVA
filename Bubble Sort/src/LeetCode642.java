import java.util.Arrays;

public class LeetCode642 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4}; // Example input
        int[] ans = findErrorNums(nums); // Correct return type

        System.out.println(Arrays.toString(ans)); // Print the result properly
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;

        // Cyclic sort: Place numbers in their correct positions
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // Finding duplicate and missing numbers
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[]{nums[index], index + 1}; // Duplicate, Missing
            }
        }

        return new int[]{-1, -1}; // Default case (should never happen)
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
