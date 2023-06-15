package com.basicjava;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner inOb = new Scanner(System.in);
        System.out.println("enter year as input: ");
        int year = inOb.nextInt();

        if(year>=1528){
            if( year%4==0 && (year%100!=0 || year%400==0)){
                System.out.println(year+ " is a leap year");
            }else{
                System.out.println(year + " is not a leap year");
            }
        }else{
            System.out.println("enter year >= 1528");
        }
    }
}
