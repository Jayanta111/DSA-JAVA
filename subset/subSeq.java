package subset;

import java.util.ArrayList;

public class subSeq {
    public static void main(String[] args) {
        //Print all subsequences
        subseq("", "abc");

        // Get all subsequences in an ArrayList and print them
        ArrayList<String> result = subseqArr("", "bcd");
        System.out.println(result);
    }

    // Method to print all subsequences
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1)); // Include the current character
        subseq(p, up.substring(1)); // Exclude the current character
    }

    // Method to return all subsequences in an ArrayList
    static ArrayList<String> subseqArr(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        // Recursive calls to get subsequences
        ArrayList<String> left = subseqArr(p + ch, up.substring(1)); // Include the current character
        ArrayList<String> right = subseqArr(p, up.substring(1)); // Exclude the current character

        // Combine the results
        left.addAll(right);
        return left;
    }
}