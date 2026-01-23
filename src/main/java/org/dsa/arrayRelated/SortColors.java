package org.dsa.arrayRelated;

import java.util.Arrays;

public class SortColors {

	public static void main(String[] args) {
//		https://leetcode.com/problems/sort-colors/description/
		int[] nums = {2,0,2,1,1,0};
		efficientApproach(nums);
	}
	
	public static void simpleApproach(int[] nums) {
		int zero = 0;
		int one = 0;
		int two = 0;
		
		for(int num : nums) {
			if(num == 0) {
				zero++;
			} else if(num == 1) {
				one++;
			} else {
				two++;
			}
		}
		for(int i = 0; i < zero; i++) {
			nums[i] = 0;
		}
		for(int i = zero; i < zero+one; i++) {
			nums[i] = 1;
		}
		for(int i = zero+one; i < zero+one+two; i++) {
			nums[i] = 2;
		}
		
		System.out.println(Arrays.toString(nums));
	}
	
	public static void efficientApproach(int[] nums) {
//		{2,0,2,1,1,0};
		int low = 0, mid= 0, high = nums.length-1 ;
		
		while(mid <= high) {
			if(nums[mid] == 0) {
				swap(nums, low, mid);
				low++;
				mid++; 
			} else if (nums[mid] == 1) {
				mid++;
			} else {
				swap(nums, mid, high);
				high--;
			}
		}
		
		System.out.println(Arrays.toString(nums));
		
	}
	private static void swap(int[] nums, int left, int right) {
		int temp = nums[left];
		nums[left] = nums[right];
		nums[right] = temp;
	}
}
