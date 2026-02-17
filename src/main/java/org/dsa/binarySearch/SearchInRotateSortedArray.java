package org.dsa.binarySearch;
// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotateSortedArray {

    public static void main(String[] args) {
        //            0 1 2 3 4 5 6 7 8
        int[] nums = {3,5,6,7,0,1,2,3,4};
        int target = 1;
        int search = search(nums, target);
        System.out.println(search);
    }

    /**
     * 1. Checking the sorted side first
     * 2. Eliminating the unsorted side
    */
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && nums[mid] >= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] <= target && nums[right] >= target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
