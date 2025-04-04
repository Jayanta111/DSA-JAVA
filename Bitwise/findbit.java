package Bitwise;

public class findbit {
    public static void main(String[] args) {
        int number = 10; // Example number
        int position = 3; // Position to find (0-based index from the right)

        int bit = findBit(number, position);
        System.out.println("The bit at position " + position + " is: " + bit);
    }

    // Method to find the bit at a specific position
    public static int findBit(int number, int position) {
        return (number >> position) & 1;
    }
}
