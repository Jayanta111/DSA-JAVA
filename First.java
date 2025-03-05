import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        System.out.println("Enter Your Name");

        Scanner input = new Scanner(System.in); // Creating Scanner object
        String name = input.nextLine(); // Reading user input

        System.out.println("Hello, " + name + "!"); // Printing the user input

        input.close(); // Closing Scanner to prevent resource leaks
    }
}
