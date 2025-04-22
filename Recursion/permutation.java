import java.util.ArrayList;

public class permutation {

    public static void main(String[] args) {
        // Example usage
        permutation("", "abc"); // Print all permutations
        ArrayList<String> result = permutationList("", "abc"); // Get all permutations in a list
        System.out.println(result);
    }

    // Method to print all permutations
    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i); // Fixed substring method
            permutation(f + ch + s, up.substring(1)); // Fixed recursive call
        }
    }

    // Method to return all permutations in an ArrayList
    static ArrayList<String> permutationList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i); // Fixed substring method
            ans.addAll(permutationList(f + ch + s, up.substring(1))); // Fixed recursive call
        }
        return ans;
    }
}