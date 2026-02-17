package org.dsa.binarySearch;

public class FloorAndCeilInArray {

    public static void main(String[] args) {
        int[] nums = {10,20,25,30,40,50};
        int target = 25;
        System.out.println("Floor >> " + Floor(nums, target) + "  Ceil >> " + Ceil(nums, target));
    }

    private static int Floor(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= target) {
                index = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    private static int Ceil(int[] nums, int target){
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
}
