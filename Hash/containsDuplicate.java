package Hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        boolean result=contains(nums);
System.out.println(result);
    }
    public static boolean contains(int[] nums){
        Set<Integer>visited=new HashSet<>();
for(int i=0;i<nums.length;i++){
    if(visited.contains(nums[i])){
        return true;
    }
    else{
        visited.add(nums[i]);
    }
}
return false;
    }
}
