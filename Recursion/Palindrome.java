public class Palindrome {
    public static void main(String[] args) {
        int n = 12321; // Example input
        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome");
        } else {
            System.out.println(n + " is not a palindrome");
        }
    }

    static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    static int reverse(int n) {
        return reverseHelper(n, 0);
    }

    static int reverseHelper(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        int rem = n % 10;
        return reverseHelper(n / 10, rev * 10 + rem);
    }
}
