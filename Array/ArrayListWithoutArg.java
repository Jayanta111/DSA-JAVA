package Array;
import java.util.ArrayList;

class ArrayListWithoutArg {

    public static void main(String[] args) {
        int[]arr={1,5,2,5,6,9};
        int target=5;
        System.out.println(findAllIndex(arr, target, 0));
    }
    static ArrayList<Integer> findAllIndex(int [] arr,int target,int index){
ArrayList<Integer>list=new ArrayList<>();
if (index==arr.length) {
    return list;
    
}
if (arr[index]==target) {
    list.add(index);
}
ArrayList<Integer>ansFromBelowCalls=findAllIndex(arr, target, index+1);
list.addAll(ansFromBelowCalls);
return list;
    }
}