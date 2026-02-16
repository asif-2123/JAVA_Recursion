import java.util.*;

public class Sorted_Array {
    public static boolean  isSorted(int arr[] , int i) {
        // Base Case
        if ( i == arr.length-1) {
            return true;
        }
        if (arr[i]>arr[i+1]) {         // checking if current element is greater than its next
            return false;              // if it's not greater then returning false goes to next
        }
        return isSorted(arr,i+1);      // recursive call to check for next elements
    }
    public static void main ( String args[] ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int size = sc.nextInt();
        System.out.println("Enter the elements of an array :");
        int arr[] = new int[size];
        for (int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr,0));

    }
    
}
