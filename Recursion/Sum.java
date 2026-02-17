import java.util.*;

public class Sum {
    public static int sum(int n) {
        // Base Case
        if (n==1) {
            return 1 ;
        }
        int snm1 = sum(n-1) ;          // Recursive Call
        int sn = n+snm1 ;               // Small Calculation
        return sn ;
    }
    public static void main ( String args[] ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive number to get sum :");
        int n = sc.nextInt();
        System.out.println(sum(n));

    } 
    
}
