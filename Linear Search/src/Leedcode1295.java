public class Leedcode1295 {
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

    public static void main(String[] args){
int[] nums={12,345,2,6,7896};
System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums ){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;

    }
    static boolean even(int num) {
        int numberofdigit=digits(num);

        return  numberofdigit%2==0;
    }

    static int digits(int num){
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }


}
