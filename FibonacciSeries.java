public class FibonacciSeries {
    public static void main(String[] args) {
        int firstNum=0;
        int secondNum=1;
        int num=10;
        for ( int i=0;i<=num;i++){
            System.out.print(firstNum+" ");
            int replace=firstNum+secondNum;
            firstNum =secondNum;
            secondNum=replace;

        }
    }
}
