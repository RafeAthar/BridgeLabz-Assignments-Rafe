package com.basicjava;

import java.util.Scanner;

public class StringEquality {

    public static void main(String[] args) {

        Scanner scanobj = new Scanner(System.in);

        System.out.println("enter first string: ");
        String str1 = scanobj.nextLine();

        System.out.println("enter second string: ");
        String str2 = scanobj.nextLine();

        System.out.println("entered strings equal?: " + String.valueOf(str1.equals(str2)));

    }
}
