package com.basicjava;

import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner inOb = new Scanner(System.in);
        System.out.println("enter values of a, b, and c for quadratic equation");
        int a = inOb.nextInt();
        int b = inOb.nextInt();
        int c = inOb.nextInt();

        double delta = b*b-4*a*c;
        double root1 = -b+ Math.sqrt(delta/(2*a)) ;
        double root2 = -b- Math.sqrt(delta/(2*a)) ;

        System.out.println("first root is: " + root1);
        System.out.println("second root is: " + root2);

    }
}
