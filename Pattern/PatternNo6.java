public class PatternNo6 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            // Printing spaces
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }
            
            // Printing decreasing numbers
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            
            // Printing increasing numbers (starting from 2)
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            
            System.out.println(); // Move to the next line
        }
    }
}
