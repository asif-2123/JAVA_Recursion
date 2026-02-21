import java.util.*;

public class Length_ofString {
    public static int lengthString(String str) {
        // Base Case
        if(str.length()==0){
            return 0;
        }
        // Recursive Call
        return lengthString(str.substring(1))+1;
    }
    public static void main(String args[]){
        String str = "hello";
        System.out.println(lengthString(str));
    }
    
}
