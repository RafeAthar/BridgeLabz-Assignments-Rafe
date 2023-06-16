package array.assignment;

public class ArraySort {

    public static void main(String[] args) {
        int arr[] = {2,3,7,1,8,5};
        System.out.println("given array:");
        for (int elem:arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("sorted array: ");
        for (int elem:arr) {
            System.out.print(elem+ " ");
        }

    }
}
