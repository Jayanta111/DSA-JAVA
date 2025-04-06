package DSA_Maths;
public class prime {
    public static void main(String[] args) {
        int n=10;
        for(int i=2;i<n;i++){
            if (n%i==0) {
                System.out.println(i+" is a prime number"); 
            }
            else{
                System.out.println(i+" is not a prime number"); 
            }
        }
    }
}
