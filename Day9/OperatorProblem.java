package com.basicjava;

public class OperatorProblem {

    public static void main(String[] args) {
        int a=6;
        int b=8;
        int c=3;

        System.out.println("Value of a is: "+ a);
        System.out.println("Value of b is: "+ b);
        System.out.println("Value of c is: "+ c);
        System.out.println("Value of a+b*c is: "+ a+b*c);
        System.out.println("Value of c+a/b is: "+ c+a/b);
        System.out.println("Value of a%b+c is: "+ a%b+c);
        System.out.println("Value of a*b+c is: "+ a*b+c);

        int maxNum = a>b? (a>c?a:a): (b>c?b:c);
        int minNum = a<b? (a<c?a:c): (b<c?b:c);
        System.out.println("maximum of the three is: "+ maxNum);
        System.out.println("minimum of the three is: "+ minNum);

        // System.out.println(45+5+ "=" + 45+5);   // prints 50=455
        // System.out.println(45+5+ "=" + (45+5));    //prints 50=50
    }
}
