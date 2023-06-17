package array.assignment;

public class FibonacciSeries {

    public static void main(String[] args) {

        int n = 10;
        int fn = 0;
        int sn = 1;

        for(int i=0; i<n; i++){
            System.out.print(fn + " ");
            int res = fn+sn;
            fn = sn;
            sn = res;
        }
    }
}
