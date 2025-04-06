package DSA_Maths;
//Using Binary Search 
public class SqureRoot {
    public static void main(String[] args) {
        int n=46;
        int p=3;
System.out.println(SqureRoot(n,p));
    }
     static double SqureRoot(int n, int p){
int start=0;
int end=n;
double root=0.0;
while (start<=end) {
    int mid =start+(end-start)/2;
    if (mid*mid==n) {
        root= mid;
        return mid;
    }
    if (mid*mid>n) 
    {
        end=mid-1;
    }
    else
        
        {
        start=mid+1;
    }
    
}
double incre=0.1;
for(int i=0;i<p;i++){

    while(root*root<=n){
root+=incre;
    }
    root-=incre;
    incre/=10;
}
return root;
    }
}
