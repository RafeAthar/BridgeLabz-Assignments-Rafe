package array.assignment;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println("till which integer you want to have perfect numbers?");
        Scanner inOb = new Scanner(System.in);
        int num = inOb.nextInt();

        for (int i = 1; i <= num; i++) {
            int half = (int)Math.ceil(i/2);
            int[] tempArr =new int[half];

            int index = 0;
            int sum=0;
            for (int j = 1; j <= half; j++) {
                if(i%j==0){
                    tempArr[index] = j;
                    index++;
                    sum +=j;
                }
            }
            if(sum==i){
                System.out.println(i + " is a perfect number. Its divisors are:");
                for(int el: tempArr){
                    if(el==0) break;
                    System.out.println(el + " ");
                }
            }

        }

    }
}
