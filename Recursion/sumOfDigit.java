public class sumOfDigit {
    public static void main(String[] args) {
int n=1342;
System.out.println(sum(n));

    }
  public  static int sum(int n){
        if (n==0) {
            return 1;
        }
return (n%10)*sum(n/10);
    }
public  static  int sum=0;
    static int Reverse (int n){
if (n==0) {
    return n;
}
  
    int rem=n%10;
    sum=sum*10+rem;
    return Reverse(n/10);
}

}
