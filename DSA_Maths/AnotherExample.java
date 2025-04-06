package DSA_Maths;

public class AnotherExample {
    public static void main(String[] args) {
        int n = 40; 
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) { // Check if the current number is prime
                System.out.println(i + " is a prime number");
            } else {
                System.out.println(i + " is not a prime number");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) { // Numbers less than or equal to 1 are not prime
            return false;
        }
        int c = 2;
        while (c * c <= n) { // Check divisors up to √n
            if (n % c == 0) { 
                return false; // If divisible, it's not prime
            }
            c++;
        }
        return true; // If no divisors found, it's prime
    }
}


