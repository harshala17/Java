import java.util.Arrays;
public class BubbleSort {
    public void sorting(int arr[]) {
        int size=arr.length;
        for (int i=0;i<size-1;i++){
            for (int j=0;j<size-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;

                }
            }
        }
    }
        public static void main(String[] args) {
            BubbleSort bs=new BubbleSort();
            int number[]={4,5,2,1,3};
            bs.sorting(number);
            System.out.println("Sorted array"+ Arrays.toString(number));
        }
}
