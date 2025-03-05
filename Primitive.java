import java.util.Scanner;

public class Primitive {
    public static void main (String[] args){
        char leter ='J';
        float marks=96.5f;
        double largeNo=456754545455.5;
long No=755121212121L;
boolean check = true;
        System.out.println(leter);
        System.out.println(marks);
        System.out.println(largeNo);
        System.out.println("Enter Your Roll No");
        Scanner input= new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int sum =num1+num2;
        System.out.println("Your Roll No is " + sum);

    }
}
