import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        //typeCasting
        int num=(int)(78.6f);
        System.out.println(num);
        int a=230;
        byte b=(byte) (a);
        System.out.println(b);
        int Number='H';
        System.out.println(Number);
        int count=1;
        while(count!=5){
            System.out.println(count);
            count++;

            }
        int c;
        for( c=1 ;c<5;c++){
            System.out.print(c);

            System.out.println("Enter Two Number");
            Scanner input= new Scanner(System.in);
            int num1 =input.nextInt();
            int num2 =input.nextInt();

            int Add = num1 + num2;
            System.out.println(Add);

    }


}

}
