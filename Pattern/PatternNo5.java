public class PatternNo5 {     
    public static void main(String[] args) {         
        int n = 5; 
        for (int row = 0; row < (2 * n - 1); row++) { 
            int totalColsInRow = row >= n ? (2 * n - 1) - row : row + 1;
            int noOfSpace = n - totalColsInRow;
            
            // Printing spaces
            for (int s = 0; s < noOfSpace; s++) {     
                System.out.print(" ");
            }
            
            // Printing stars
            for (int col = 0; col < totalColsInRow; col++) {     
                System.out.print("* ");
            }
            
            System.out.println(); 
        }      
    } 
}
