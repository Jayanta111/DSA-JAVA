public class PatternNo2 {
    public static void main(String[] args) {
        int n=4;
        for(int row=0;row<=n;row++){
            for(int col=1;col<n+1-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
