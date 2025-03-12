public class LeetCode268 {
    //Given an array nums containing n distinct numbers in the range [0, n],
    // return the only number in the range that is missing from the array.
    //https://leetcode.com/problems/missing-number/
    //Amazon Interview Question
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
System.out.println("The Missing number is  " + missingNumber(nums));

    }

    public static int missingNumber(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correctIndex = nums[i];

            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int index=0;index<nums.length;index++){
            if (nums[index]!=index){
                return index;
            }
    }
return nums.length;
}
static void swap(int[] nums, int first, int second){
    int temp=nums[first];
    nums[first]=nums[second];
    nums[second]=temp;
        }
}
