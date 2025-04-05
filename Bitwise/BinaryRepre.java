package Bitwise;

import java.util.Scanner;

public class BinaryRepre {
    public static void main(String[] args) {
        int n=0;
        System.out.println("Enter Any Number to find its Binary Representation :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits( n));
    }
    private static int setBits(int n) {
        int c=0;
        while (n>0) {
            c++;
        n-=(n& -n);

        }
        return c;
    }
}
