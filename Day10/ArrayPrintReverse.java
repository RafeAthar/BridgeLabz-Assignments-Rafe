package array.assignment;

public class ArrayPrintReverse {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("given array:");
        for (int elem:arr) {
            System.out.print(elem + " ");
        }
        System.out.println();

        System.out.println("array elements in reverse order: ");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
