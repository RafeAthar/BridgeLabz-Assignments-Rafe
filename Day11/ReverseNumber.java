package array.assignment;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println("Enter number to be reversed");
        Scanner inOb = new Scanner(System.in);
        int num = inOb.nextInt();

        int reverse=0;
        while(num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num =num/10;
        }
        System.out.println("reverse is: " + reverse);      }
}
