public class SelectionSort {
        public static void printArr(int arr[]){
            for (int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
    public static void main(String[] args) {

        int[] arr={3,5,1,4,2};
        //outer loop will run n-1 times.
        for (int i =0 ; i< arr.length-1;i++){
            int smallest=i;
            //to compare with next element will write a for loop,
            for (int j=i+1;j< arr.length;j++){
                if (arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printArr(arr);
    }

}
