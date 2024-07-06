package Basics;

import java.util.Scanner;

public class SwapInt {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter m value");

        int m = scn.nextInt();
        System.out.println("enter n value");
        int n = scn.nextInt();


        int temp = n;
        n= m;
        m= temp;
        System.out.println("val of m  " + m + " value of n is " + n);


    }
}
