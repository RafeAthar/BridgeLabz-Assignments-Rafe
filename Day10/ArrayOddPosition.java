package array.assignment;

public class ArrayOddPosition {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println("given array:");
        for (int elem:arr) {
            System.out.print(elem + " ");
        }
        System.out.println();

        System.out.println("elements present at even position in array are: ");
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                System.out.print(arr[i] + "  ");
            }
        }
    }
}
