import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode442 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1}; // Define nums array before using
        List<Integer> ans = findDuplicates(nums); // Correct return type
        System.out.println(ans); // Print the correct variable
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        // Cyclic sort to place numbers in their correct positions
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // Check for duplicates
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(nums[index]); // Add the misplaced duplicate number
            }
        }
        return ans;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
