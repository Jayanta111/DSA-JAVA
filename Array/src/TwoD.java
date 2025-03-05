public class TwoD {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 5, 6},
                {5, 6}, {9, 8, 7}};


        System.out.println("2D Array is ");
        //Outer loop
        for (int[] ints : arr) {
            //Inner loop
            for (int col = 0; col < ints.length; col++) {
                System.out.print(ints[col] + " ");
            }
            System.out.println();

        }

    }
}

