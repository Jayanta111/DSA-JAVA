package subset;

import java.util.ArrayList;

public class ASCII {

    public static void main(String[] args) {
        // Get all subsequences including ASCII values in an ArrayList and print them
        ArrayList<String> result = subseqArr("", "bcd");
        System.out.println(result);
    }

    // Method to return all subsequences in an ArrayList (including ASCII values)
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
        ArrayList<String> ascii = subseqArr(p + (ch + 0), up.substring(1)); // Include the ASCII value of the character

        // Combine the results
        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
}