import java.util.*;
public class reversenumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int rev=0;
        while (number!=0){
            rev=rev*10+number%10;
            number=number/10;
        }
        System.out.println("Reversed Number is :"+rev);

    }
}
