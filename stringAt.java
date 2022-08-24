import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class stringAt {
    public static void main(String[] args) {
        String firstName="Harshala";
        String lastName="Athani";
        String fullName=firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());
            //to print each character.
        for (int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

       // compare to strings.
        String name="Harshala";
        String sameName="Harshala";
        if (name.compareTo(sameName)==0){
            System.out.println("Same");
        }
        else {
            System.out.println("Not equal");
        }
        if (name.equals(sameName)){
            System.out.println("Same name");
        }
        else {
            System.out.println("Names are different");
        }

        String sentence="Hello all, my name is Harshala Athani, currently pursuing BE in Computers";
        //starts from 0;
        System.out.println(sentence.substring(0,5));


    }
}