import java.util.*;

public class Numbers_decreasing_order {
    public static void printDecreasing ( int n ) {
        // Base Case
        if (n==1) {
            System.out.print(n);
            return;                             // Ending Condition
        }
        // Recursive Case
        System.out.print(n + " ");
        printDecreasing(n-1);                   // Function Call later so it prints the given n first
    }
    public static void main (String args[] ) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printDecreasing(n);                     // Function Call
    }
}