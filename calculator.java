import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double first=scanner.nextDouble();
        double second=scanner.nextDouble();
        char operator;
        System.out.println("Choose (+,-,*,/): ");
        operator=scanner.next().charAt(0);
        double result;

        switch(operator){
            case '+':
                result=first+second;
                break;
            case '-':
                result=first-second;
                break;
            case '*' :
                result=first*second;
                break;
            case '/':
                result=first/second;
                break;
            default:
                System.out.println("Error! operator is not correct");
            return;
        }
        System.out.println("Result is: "+result);
    }
}
