import java.util.*;

public class Last_Occurance_II {
    public static int lastOccurance ( int arr[], int i , int key) {
        //Base Case
        if ( i == arr.length) {
            return -1 ;
        }
        int isFound = lastOccurance (arr,i+1,key);     // recursive call to check for next elements
        if(isFound == -1 && arr[i]==key) {             // checking if current element is equal to key
            return i;
        }
        return isFound ;
    }
    public static void main (String args[]) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        int key = 5 ;
        System.out.println(lastOccurance(arr,0,key));
    }
    
}
