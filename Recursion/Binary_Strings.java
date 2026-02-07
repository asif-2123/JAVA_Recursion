import java.util.*;

public class Binary_Strings {
    public static void binStrings(int n , int lastPlace , String str){
        // Base Caase
        if(n==0){
            System.out.println(str);
            return;
        }
        // Choice 1 : place 0 at current index
        binStrings(n-1, 0, str+"0");
        // Choice 2 : place 1 at current index
        if(lastPlace==0){
            binStrings(n-1, 1, str+"1");
        }
    }
    public static void main ( String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        binStrings(n, 0, new String());
    }
    
}
