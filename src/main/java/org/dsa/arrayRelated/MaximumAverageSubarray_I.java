package org.dsa.arrayRelated;

//https://leetcode.com/problems/maximum-average-subarray-i/description/
public class MaximumAverageSubarray_I {

	public static void main(String[] args) {
		int[] nums = {1,12,-5,-6,50,3};
		int k = 4;
		double maxAverage = findMaxAverage(nums, k);
		System.out.println(maxAverage);
	}

	public static double findMaxAverage(int[] nums, int k) {

		double maxAverage = 0.0;
		double average = 0.0;
		int left = 0;
		int right = 0;
		
		while(right < nums.length) {
			average = average + nums[right];
			int len = right - left + 1;
			if(len > k) {
				average = (average - nums[left]) / k;
				left++;
			}
			maxAverage = Math.max(maxAverage, average);
			right++;
		}
		
		return maxAverage;
	}

}
