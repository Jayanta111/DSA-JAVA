import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){
        int[] arr={ 6,8,4,5,4,9,10};

Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int low,int high){
        if (low>=high){
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];
        while (start<=end){
            while (arr[start]<pivot){
                pivot++;
            }
            while (arr[end]>pivot){
                end--;
            }
            if (start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            sort(arr,low,end);
            sort(arr,start,high);

        }
    }
}
