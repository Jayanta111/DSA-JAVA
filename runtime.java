public class runtime {
    public static void main(String[] args) {
        int[] arrA = {1, 2, 4, 3};
        int[] arrB = {3, 4, 5, 6, 7};

        // Example usage of the print methods
        System.out.println("Elements of arrA:");
        printArray(arrA);

        System.out.println("Elements of arrB:");
        printArray(arrB);
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}