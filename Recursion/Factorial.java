import java.util.* ;

public class Factorial {
    public static int factorial ( int n ) {
        // Base case
        if (n ==0 || n ==1 ) {
            return 1 ;                  // Ending Condition
        }
        int fnm1 = factorial(n-1);      // Recursive call
        int fn = n*fnm1;                // Small Calculation
        return fn;                      // Returning the factorial now
    }
    public static void main ( String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number to get factorial :");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    
}
