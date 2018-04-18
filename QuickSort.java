public class QuickSort {

    public static int partition(int[] arr, int low, int high) {
        int i=low-1;
        for(int j= low;j<=high-1;j++){
            if(arr[j]<=arr[high]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp1 = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp1;
        return i+1;
    }

    public static void QuickSortFunc(int[] arr, int low, int high){
        if(low<high){
            int pivot=partition(arr, low, high);
            QuickSortFunc(arr, low, pivot-1);
            QuickSortFunc(arr, pivot+1, high);
        }
    }


    public static void main(String[] args) {
        int[] arr = {12000, 3100, 1195, 33, 1121, 90};
        QuickSortFunc(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println("Result array :" + i);
        }
    }
}