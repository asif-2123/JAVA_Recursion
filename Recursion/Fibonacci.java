import java.util.*;

public class Fibonacci {
    public static int fib(int n) {
        // Base Case
        if ( n==0 || n==1) {
            return n;
        }
        int fibnm1 = fib(n-1);           
        int fibnm2 = fib(n-2);
        int fibn = fibnm1 + fibnm2;      // Small calculation of its two elements before it
        return fibn;
    }
    public static void main ( String args[] ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
    
}
