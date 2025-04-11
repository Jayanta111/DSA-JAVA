public class ArrayIsSortedOrNot {
    //Find if array is sorted or not
    public static void main(String[] args) {
        int[] arr={1,2,4,8,9,12}; 
System.out.println(Sorted(arr, 0));
    }
    public static boolean Sorted(int[] arr ,int i){
  if (i==arr.length-1) {
    return true;
  }
  return arr[i]<arr[i+1] && Sorted(arr, i+1);

    }
}
