package org.LeetCode.Strings.Arrays;

//1920. Build Array from Permutation
public class Build_Array_from_Permutation {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        buildArray(arr);
    }

    public static void buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        //[0,2,1,5,3,4]

        for(int i=0;i< nums.length;i++){
            ans[i] = nums[nums[i]] ;
        }
       //return ans;
        for (int n : ans){
            System.out.println(n);
        }
    }
}
