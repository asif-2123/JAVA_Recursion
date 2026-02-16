// Time complexity : O(log n)

import java.util.*;

public class Power_Optimized {
    public static int power (int x , int n) {
        // Base case
        if (n==0) {
            return 1;
        }
        int halfPower = power(x,n/2);
        int halfPowerSq = halfPower*halfPower;          // to square the half power
        if(n%2 ==1) {
            halfPowerSq = x*halfPowerSq;               // if n is odd multiply with x
        }

        return halfPowerSq;
    }
    public static void main ( String args[] ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base :");
        int x = sc.nextInt();
        System.out.println("Enter the power :");
        int n = sc.nextInt();
        System.out.println(power(x,n));
    }
    
}
