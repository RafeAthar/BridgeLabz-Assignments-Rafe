package com.basicjava;

import java.util.Scanner;

public class SpringSeason {

    public static void main(String[] args) {
        Scanner inOb = new Scanner(System.in);
        System.out.println("enter month number");
        int m = inOb.nextInt();
        System.out.println("enter day number");
        int d = inOb.nextInt();

        System.out.println(m>=3 && m<=6 && d<=20);

    }
}
