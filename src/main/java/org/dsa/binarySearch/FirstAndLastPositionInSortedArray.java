package org.dsa.binarySearch;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        int nums[] = {5,7,8,8,8,10};
        int target = 8;
        // System.out.println(Arrays.toString(simpleApproach(nums, target)));
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = firstOccurance(nums, target);
        if(first == -1){
            return new int[]{-1,-1};
        }
        return new int[]{first, lastOccurance(nums, target)};
    }

    /**
     * We need to find the lowest occurance, so eliminating the higher elements
    */
    private static int firstOccurance(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high)/2;
            if(nums[mid] == target){
                index = mid;
                high = mid - 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }

    /**
     * We need to find the highst occurance, so eliminating the lower elements
    */
    private static int lastOccurance(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high)/2;
            if(nums[mid] == target){
                index = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    private static int[] simpleApproach(int[] nums, int target){
        int first = -1;
        int last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if(first == -1){
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first, last};
    }
}
