package com.basicjava;

import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
        Scanner inOb = new Scanner(System.in);
        System.out.println("enter values of point coordinates x and y");
        int x = inOb.nextInt();
        int y = inOb.nextInt();

        double distance = Math.pow(x*x+y*y, 0.5);
        System.out.println("distance between origin and ("+ x + ", " + y + ") is: " + distance );
    }
}
