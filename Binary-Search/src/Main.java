import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
int arr[]={2,4,9,10,12,18,19};
int target=10;
System.out.println("The array of all numbers:" + Arrays.toString(arr));
int ans=binarySearch(arr,target);
System.out.println("The Targeted element " + target + " is in index " +ans);

     }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end= arr.length-1; 
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;

            }
            else
                if(target>arr[mid]){
                    start=mid+1;
                }
                else {
                    return mid;

                }

        }
        return -1;
    }
    }

