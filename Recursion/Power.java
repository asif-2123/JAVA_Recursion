import java.util.*;

public class Power {
    public static int power(int x , int n) {
        // Base Case
        if ( n==0) {
            return 1;
        }
        int xpnm1 = power (x,n-1) ;      // recursive call to calculate power of n-1
        int xpn = x * xpnm1 ;           // small calculation to multiply x with power of n-1
        return xpn ;
    }
    public static void main ( String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base :");
        int x = sc.nextInt();
        System.out.println("Enter the power :");
        int n = sc.nextInt();
        System.out.println(power(x,n));
    }
    
}
