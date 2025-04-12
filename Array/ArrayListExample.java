package Array;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 8};
        int target = 4;

        ArrayList<Integer> result = findAllIndices(arr, target, 0, new ArrayList<>());
        System.out.println("Indices of target " + target + ": " + result);
    }

    static ArrayList<Integer> findAllIndices(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) { 
            return list;
        }
        if (arr[index] == target) { // If the target is found, add the index to the list
            list.add(index);
        }
        return findAllIndices(arr, target, index + 1, list); // Recursive call
    }
}