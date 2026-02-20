import java.util.*;

public class Tower_of_Hanoi {
    public static void tower_ofHanoi (int n , String source , String helper , String destination){
        // BAse Case
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+source+" to "+destination);
            return;
        }
        // Move n-1 disks from source to helper
        tower_ofHanoi(n-1 , source , destination , helper);
        System.out.println("Transfer disk "+n+" from "+source+" to "+destination);
        // Move n-1 disks from helper to destination
        tower_ofHanoi(n-1 , helper , source , destination);
        
    }
    public static void main ( String args []){
        int n=3; // Number of disks
        tower_ofHanoi(n , "S" , "H" , "D");
    }
    
}
