package Basics;

import java.util.Scanner;

// multiply two floating no's
public class MultiplyFloating {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a numbers");
        float f = scn.nextFloat();
        float f1 = scn.nextFloat();




        float m = f * f1;

        System.out.println("the product is "      +      m);
    }
}
