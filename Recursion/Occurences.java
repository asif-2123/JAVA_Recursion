import java.util.*;

public class Occurences {
    public static void printOccurances(int arr[] , int index , int key){
        // Base Case 
        if(index==arr.length){
            return;
        }
        // Searching for key
        if(arr[index]==key){
            System.out.print(index+" ");
        }
        // Recursive Call
        printOccurances(arr, index+1, key);
    }
    public static void main(String args[]){
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key = 2;
        printOccurances(arr,0,key);
    }
    
}
