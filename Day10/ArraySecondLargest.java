package array.assignment;

public class ArraySecondLargest {

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
        System.out.println("second largest element in given array is: "+ arr[arr.length-2]);


        // There is a flaw in below logic.
        /*
        int largest = arr[0];
        int secondLargest = arr[1];

        for(int elem:arr){
            //largest = elem>largest? elem: largest;
            if(elem>largest){
                secondLargest = largest;
                largest = elem;
            }
        }
        System.out.println("second largest element in given array is: "+ secondLargest);
         */
    }
}
