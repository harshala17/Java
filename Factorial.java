public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        int number=5;
        for (int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+ number + " is :"+fact);
    }
}



//Output
//Factorial of 5 is: 120
//5!=5*4*3*2*1=120
