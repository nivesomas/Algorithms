public class MergeSort {

    public static void Merge(int[] arr, int left, int mid, int right){
        int l1=mid -left +1;
        int l2=right-mid;
        int[] arr1 = new int[l1];
        int[] arr2 = new int[l2];
        int[] arr3 = new int[arr1.length+arr2.length];
        for(int iter1=0;iter1< l1 ; iter1++) {
            arr1[iter1] = arr[left+iter1];
        }

        for(int iter2=0;iter2< l2 ; iter2++) {
            arr2[iter2] = arr[mid+1+iter2];
        }

        int i=0,j=0,k=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        System.arraycopy(arr3,0,arr,left, arr3.length);
    }

    public static void MergeSortFunc(int[] arr,int left, int right){
        int m = (left+right)/2;
        if (left < right) {
            MergeSortFunc(arr, left, m);
            MergeSortFunc(arr, m + 1, right);
        }
        Merge(arr,left,m,right);
    }


    public static void main(String[] args) {
        int[] arr = {120, 31, 119, 33, 1121, 90};
        MergeSortFunc(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println("Result array :" + i);
        }
    }
}