public class pyramid {
    public static void main(String[] args) {
        int rows=4;
        int i,k,j;
        for (i=1;i<=rows;i++) {
            for (j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
            for (i=rows-1;i>=1;i--) {
                for (j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
                for (k = 1; k <= i; k++) {
                    System.out.print("*" + " ");
                }

                System.out.println();
            }

    }
}
