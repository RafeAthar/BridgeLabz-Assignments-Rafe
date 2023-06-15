// package com.basicjava;

import java.util.Scanner;

public class NameFromCmd {

    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Enter your name");
        String myName = inputObj.nextLine();

        System.out.println("Hello " + myName);
    }
}