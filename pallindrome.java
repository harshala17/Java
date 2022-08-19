import java.util.*;
public class pallindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= scanner.nextInt();
        int newnum=number;

        int rev=0;
        while (number!=0){
            rev=rev*10+number%10;
            number=number/10;
        }
        System.out.println("Reversed number:"+rev);
            if (newnum==rev){
                System.out.println("It is Palindrom");
            }
            else {
                System.out.println("Not a Palindrom");
            }
    }
}
