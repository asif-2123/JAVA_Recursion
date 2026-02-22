public class Numbers_toStrings {
    // Array to map digits to words
    static String digits[] ={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    // --> staic String is formed to pass the string back in recursion 
    
    public static String convertString(int n){
        //Base Case 
        if(n==0){
            return new String();
        }
        // Cutting the last digit and processing
        int laastDigit = n%10;
        // Recursive Call
        String str = convertString(n/10);
        //
        return str + " " + digits[laastDigit] ;
    }
    public static void main(String args[]){
        int n = 12345;
        System.out.println(convertString(n));
    }
    
}
