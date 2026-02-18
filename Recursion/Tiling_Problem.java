import java.util.*;

public class Tiling_Problem {
    public static int tiling(int n){
        // Base Case
        if (n==0 || n==1){
            return 1;
        }
        //Vertical Choice
        int fnm1 = tiling(n-1);
        //Horizontal Choice
        int fnm2 = tiling(n-2);
        int ways = fnm1+fnm2;
        return ways;
    }
    public static void main ( String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        System.out.println(tiling(n));
    }
}
