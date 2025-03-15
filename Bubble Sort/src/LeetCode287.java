

public class LeetCode287 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                } else {
                    return nums[i];  // Found duplicate
                }
            } else {
                i++;
            }
        }
        return -1;  // No duplicate found (though the problem guarantees one exists)
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
