

public class Factoril {
    public static void main(String[] args) {
        int n=5;
System.out.println(factor(n));
    }
   public static int  factor(int n){
        if (n==1) {
            return 1;
        }
        return n*factor(n-1);
    }
}
