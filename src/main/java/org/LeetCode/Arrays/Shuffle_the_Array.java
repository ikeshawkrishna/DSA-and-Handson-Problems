package org.LeetCode.Strings.Arrays;

import java.util.Arrays;

public class Shuffle_the_Array {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;


        int[] ans = shuffle(nums,n);
        for (int n1 : ans){
            System.out.println(n1);
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int j = 0;

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length/2; i=i+2) {

                ans[i] = nums[i];
                j = (nums.length/2)+i;
                ans[i+1] = nums[j];

        }
        return ans;
    }
}
