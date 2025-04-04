package Bitwise;

// Find Magic number
public class findnth {
    public static void main(String[] args) {
        int n = 6; // Example input
        int ans = 0;
        int base = 5;

        while (n > 0) {
            int last = n & 1; // Get the last bit
            ans += last * base; // Add the contribution of the current bit
            base = base * 5; // Update the base (powers of 5)
            n = n >> 1; // Right shift to process the next bit
        }

        System.out.println("The 6th magic number is: " + ans);
    }
}
