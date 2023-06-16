package array.assignment;

public class ArraySmallestElement {

    public static void main(String[] args) {
        int arr[] = {2,3,7,1,8,5};
        int smallest = arr[0];

        for(int elem:arr){
            smallest = elem<smallest? elem: smallest;
        }
        System.out.println("smallest element in given array is: "+ smallest);
    }
}
