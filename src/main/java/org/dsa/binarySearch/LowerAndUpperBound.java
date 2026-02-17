package org.dsa.binarySearch;

public class LowerAndUpperBound {

    public static void main(String[] args) {
        int[] nums = {3,4,6,7,9,12,16,17};
        int target = 4;
        System.out.println(LowerBound(nums, target));
        System.out.println(UpperBound(nums, target));
    }

    private static int LowerBound(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int index = nums.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= target) {
                index = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }

    private static int UpperBound(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int index = nums.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target) {
                index = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }
}
