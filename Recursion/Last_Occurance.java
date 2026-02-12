import java.util.*;

public class Last_Occurance {
    public static int lastOccurance ( int arr[] , int i , int key) {
        // Base Case
        if(i<0) {
            return -1;
        }     
        if ( arr[i]==key){                       // checking if current element is equal to key
            return i;
        }
        return lastOccurance(arr,i-1,key);      // recursive call to check for next elements
    }
    public static void main( String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        System.out.println(lastOccurance(arr,arr.length-1,key));
    
    }
    
}
