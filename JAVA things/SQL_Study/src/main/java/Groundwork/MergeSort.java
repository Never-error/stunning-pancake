package Groundwork;

public class MergeSort {
    public static void merge(int[] arr, int start, int mid, int end ){
        int[] tmp = new int[end - start + 1];
        int a = start;
        int b = mid + 1;
        int k = 0;
        while (a <= mid && b <= end){
            if (arr[a] < arr[b]){
                tmp[k] = arr[a];
                a++;
                k++;
            }
            else {
                tmp[k++] = arr[b++];
            }
        while (a <= mid )
            tmp[k++] = arr[a++];

        while (b <= mid)
            tmp[k++] = arr[b++];

        for (int i  = 0 ; i < k ; i++){
            arr[start+i] = tmp[i];
        }
        tmp = null;
        }



    }
    public void sort(){

    }

    public void startMerge(int[] array){
        int len = array.length;
        int mid = len / 2;
        merge(array, len);

    }

}
