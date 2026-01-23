package org.dsa.arrayRelated;

import java.util.Arrays;

public class SlidingWindowMaximum {

	public static void main(String[] args) {

		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		int[] maxSlidingWindow = simpleApproach(nums, k);
		System.out.println(Arrays.toString(maxSlidingWindow));
	}

	public static int[] maxSlidingWindow(int[] nums, int k) {
		int[] result = new int[nums.length - k + 1];
		int index = 0;
		int maxValue = 0;
		
		for(int i = 0; i < k; i++) {
			maxValue = Math.max(maxValue, nums[i]);
		}
		result[index] = maxValue;
		index++;
		
		for(int i = k; i < nums.length; i++) {
			maxValue = Math.max(maxValue, nums[i]);
			result[index] = maxValue;
			index++;
		}
		
		return result;
	}
	
//	1,3,-1,-3,5,3,6,7
	public static int[] simpleApproach(int[] nums, int k) {
		int[] result = new int[nums.length - k + 1];
		int index = 0;
		for(int i = 0; i < nums.length-k+1; i++) {
			int maxvalue = 0;
			for(int j = i; j < i+k; j++) {
				maxvalue = Math.max(maxvalue, nums[j]);
			}
			result[index] = maxvalue;
			index++;
		}
		
		return result;
	}
}
