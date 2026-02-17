package org.dsa.binarySearch;

public class SearchElement {

    public static void main(String[] args) {
        int num[] = { 3, 4, 6, 7, 9, 12, 16, 17 };
        int target = 1;

        System.out.println(iterative(num, target));
    }

    public static int iterative(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int recursive(int[] nums, int low, int high, int target) {
        int mid = (low + high) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        return 0;
    }
}
