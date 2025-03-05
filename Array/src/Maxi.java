public class Maxi {
    public static void main(String[] args){
        int[] arr={1,3,23,9,180};
        System.out.println("Max Value");
        System.out.println(Max(arr));
        System.out.println("Max Value Range Between");

        System.out.println(MaxRange(arr,1,4));

    }

    static int Max(int[] arr){
        int maxval=arr[0];
        for (int i=1;i<arr.length;i++){
            if(maxval<arr[i]){
                maxval=arr[i];
            }
        }
        return maxval;
    }
static int MaxRange(int[]arr ,int start,int end){
        int maxRange=arr[start];
        for (int i=start;i<=end;i++){
            if(arr[i]>maxRange){
                maxRange=arr[i];

            }
        }
        return maxRange;

}

}
