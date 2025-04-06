package DSA_Maths;

public class AnotherExample {
    public static void main(String[] args) {
        int n = 29; 
        for(int i=1;i<=n;i++){
        if (isPrime(n)) {
            System.out.println(i + " is a prime number");
        } else {
            System.out.println(i + " is not a prime number");
        }
    }
}

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) { 
                return false;
            }
            c++; 
        }
        return true;
    }
}


