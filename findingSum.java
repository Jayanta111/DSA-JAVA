import java.util.HashSet;

public class findingSum {

    // Given a collection of numbers, find if there is a pair that sums to 8
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 4};
        int targetSum = 8;

        if (hasPairWithSum(arr, targetSum)) {
            System.out.println("Pair found that sums to " + targetSum);
        } else {
            System.out.println("No pair found that sums to " + targetSum);
        }
    }

    public static boolean hasPairWithSum(int[] data, int sum) {
        HashSet<Integer> comp = new HashSet<>();
        for (int value : data) {
            if (comp.contains(value)) {
                return true;
            }
            comp.add(sum - value);
        }
        return false;
    }
}
