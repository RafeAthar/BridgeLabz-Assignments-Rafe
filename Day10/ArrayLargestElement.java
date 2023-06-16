package array.assignment;

public class ArrayLargestElement {

    public static void main(String[] args) {
        int arr[] = {2,3,7,1,8,5};
        System.out.println("given array:");
        for (int elem:arr) {
            System.out.print(elem + " ");
        }
        System.out.println();

        int largest = arr[0];

        for(int elem:arr){
            largest = elem>largest? elem: largest;
        }
        System.out.println("largest element in given array is: "+ largest);
    }
}
