import java.util.Scanner;

public class reversedpyramid {
    public static void main(String[] args) {
        int rows=5;
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<=rows-1-i;k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
