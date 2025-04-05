class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] arr:image){
            //Reserve the array
            for(int i=0;i<(image[0].length+1)/2;i++){
                //Swap the elements
                int temp=arr[i]^1;
                arr[i]=arr[arr.length-i-1]^1;
                arr[arr.length-i-1]=temp;

            }
        }
        return image;
    }
}