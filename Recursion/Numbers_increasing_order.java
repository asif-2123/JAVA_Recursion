import java.util.*;

public class Numbers_increasing_order {
    public static void printIncreasing ( int n ) {
        // Base Case 
        if ( n==1) {
            System.out.print(n+" ");
            return;                             // Ending Condition
        }
        printIncreasing ( n-1 ) ;               // Function Call first so goes to 1 and then prints while returning
        System.out.print(n+ " ");               
    }
    public static void main (String args[] ) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printIncreasing(n);                     // Function Call
    }
    
}
