package DSA_Maths;

public class Seive {
    public static void main(String[] args) {
        int n=40;
        boolean[] primes=new boolean[n+1];
        System.out.println(primes[0]);
        seive(primes,n);
    }
    //false in arr means number is prime
    static void seive(boolean[] primes,int n){
for(int i=2;i*i<=n;i++){
    if (!primes[i]) {
for(int j=i*2;j<=n;j+=i){
    primes[j]=true;
}
        
    }
}
for(int i=2;i<=n;i++ ){
    if (!primes[i]) {
        System.out.println(i +" " + "is Prime Number");
        
    }
}
    }
}
