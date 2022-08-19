import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        String input="Hello";

        String strRev="";

        int len=input.length();

        for (int i=len-1; i>=0; i--){
            strRev=strRev+input.charAt(i);
        }

        System.out.println("Reversed String :"+strRev);
    }
}
