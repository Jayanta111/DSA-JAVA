import java.util.Arrays;

public class TwoSum {

    public static int[] findTwoSumTwoPointer(int[] nums, int target) {
        Arrays.sort(nums); //Requires Sorting the array
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                // Note:  We need to find original indices, not sorted indices.  This requires additional logic if needed.
                return new int[]{left, right}; //This will return index of sorted array.
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {}; // Or return null
    }


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSumTwoPointer(nums, target);
        System.out.println("Two Pointer Result 01: " + Arrays.toString(result)); // Output: [0, 1]


        int[] nums2 = {3,2,4};
        int target2 = 6;
        int[] result2 = findTwoSumTwoPointer(nums2, target2);
        System.out.println("Two Pointer Result 02: " + Arrays.toString(result2)); // Output: [1,2]

        int[] nums3 = {3,3};
        int target3 = 6;
        int[] result3 = findTwoSumTwoPointer(nums3, target3);
        System.out.println("Two Pointer Result 03: " + Arrays.toString(result3)); // Output: [0,1]
    }
}