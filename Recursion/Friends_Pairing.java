import java.util.*;

public class Friends_Pairing {
    public static int friendPairs(int n){
        // Base Case 
        if(n==1 || n==2){
            return n;
        }
        // Single Choice
        int fnm1 = friendPairs(n-1);
        // Pairing Choice
        int fnm2 = friendPairs(n-2);
        // Choices for each after 1 pair formation
        int pairWays = (n-1)*fnm2;

        int totalWays = fnm1 + pairWays;
        return totalWays;
    }
    public static void main ( String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        System.out.println(friendPairs(n));
    }
}
