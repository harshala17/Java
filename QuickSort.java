public class QuickSort {
    //take pivot as last element..
    public static int partition(int arr[],int low, int high){
        int pivotReal=arr[high];
        return pivotReal;
    }
    public static void quickSort(int arr[],int low,int high){
    //first always check if my low is less than high
        if (low<high){
            int pivot=partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
//    public static void partition(){
//
//    }
        public static void main(String[] args) {
        int[] arr={6,3,9,5,2,8};
        int size=arr.length;
        quickSort(arr,0,size-1);
    }

}
