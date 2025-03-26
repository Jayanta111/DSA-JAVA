package Recursion;

public class HelloWorld {
    public static void main(String[] args) {
        printHelloWorld(5); // Call the recursive function with 5 repetitions
    }

    static void printHelloWorld(int n) {
        if (n == 0) return; // Base case to stop recursion
        System.out.println("Hello World"); // Print message
        printHelloWorld(n - 1); // Recursive call
    }
}
