import java.util.*;

public class First_Occurance {
    public static int firstOccurance ( int arr[] , int i , int key) {
        // Base Case
        if (i==arr.length) {
            return -1;
        }
        if ( arr[i]==key){                       // checking if current element is equal to key
            return i;
        }
        return firstOccurance(arr,i+1,key);      // recursive call to check for next elements
    }
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int size = sc.nextInt();
        System.out.println("Enter the elements of an array:");
        int arr[] = new int[size];
        for ( int i=0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key to find its first occurance:");
        int key = sc.nextInt();
        System.out.println(firstOccurance(arr,0,key));
    }
    
}
