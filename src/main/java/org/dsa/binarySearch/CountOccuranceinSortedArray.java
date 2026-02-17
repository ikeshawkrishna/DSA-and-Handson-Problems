package org.dsa.binarySearch;

// https://takeuforward.org/plus/dsa/problems/count-occurrences-in-a-sorted-array?tab=description
public class CountOccuranceinSortedArray {

    public static void main(String[] args) {
        int nums[] = {5,7,8,8,8,10};
        int target = 8; 
        int result = lastOccurance(nums, target) - firstOccurance(nums, target) + 1;
        System.out.println(result);
    }
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
}
