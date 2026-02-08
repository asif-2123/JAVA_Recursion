import java.util.*;

public class Duplicate {
    public static void removeDuplicate(String str , int index , StringBuilder newStr , boolean map[]){
        //Base Case
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        // Duplicate Present
        if(map[currChar - 'a']==true){
            // Not taking that char
            removeDuplicate(str, index+1, newStr, map);
        }
        // Duplicate Not Present
        else{
            // Taking that char
            map[currChar- 'a']=true;
            // Adding char to new String afterwards
            removeDuplicate(str, index+1, newStr.append(currChar), map);
        }
    }
    public static void main ( String args []){
        String str = "appnnacollege";
        // To keep track of duplicates
        // takng the right parts to indicating new boolean array and StringBuilder
        removeDuplicate(str, 0, new StringBuilder(), new boolean[26]);
    }
}
