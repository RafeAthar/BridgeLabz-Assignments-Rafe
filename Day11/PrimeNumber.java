package array.assignment;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("till which integer you want to have prime numbers?");
        Scanner inOb = new Scanner(System.in);
        int num = inOb.nextInt();

        for (int i = 2; i <= num; i++) {
            boolean prime=true;
            int half = (int)Math.ceil(i/2);
            for (int j = 2; j <= half; j++) {
                if(i%j==0){
                    prime=false;
                    break;                }
            }
            if(prime){
                System.out.println(i + " is prime");
            }
        }

    }
}

