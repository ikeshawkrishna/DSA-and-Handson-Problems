package org.LeetCode.Strings.Arrays;

public class Concatenation_of_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        getConcatenation(nums);
    }
    public static void getConcatenation(int[] nums) {

        int[] ans = new int[nums.length * 2];

        for(int i=0; i< nums.length * 2 ; i++){
            if(i < nums.length/2 ){
                ans[i] = nums[i];
            } else {
                ans[i] = nums[i% nums.length];
            }
        }

        for (int n : ans){
            System.out.println(n);
        }


        // Method 2
        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);

        //return ans;
    }
}
