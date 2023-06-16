package array.assignment;

public class ArrayElementFrequency {

    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5,6,2,4,5,6};
        System.out.println("given array:");
        for (int elem:arr) {
            System.out.print(elem + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++){
            int visited = 0;
            int freq = 0;
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    visited = 1;
                    break;
                }
            }
            if (visited == 1)
                continue;
            for (int j = 0;j<=i;j++){
                if (arr[i] == arr[j])
                    freq++;
            }
            System.out.println(arr[i]+": "+freq);
        }


    }
}
