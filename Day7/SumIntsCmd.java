package com.basicjava;

import java.util.Scanner;

public class SumIntsCmd {

    public static void main(String[] args) {
        Scanner inOb = new Scanner(System.in);

        System.out.println("Enter integers: ");
        String input = inOb.nextLine();
        String[] inputArray = input.trim().split(" ");

        int invalidInts = 0;
        int sumOfInts = 0;
        for (String inp: inputArray){
            try{
                sumOfInts += Integer.parseInt(inp);
            }catch(NumberFormatException e){
                invalidInts++;
            }
        }

        System.out.println("number of invalid integers entered: "+ invalidInts);
        System.out.println("Sum of valid integers entered: "+ sumOfInts);
    }
}
