package org.dsa.arrayRelated;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/description/
public class MoveZeros {

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		simpleApproach(nums);
	}
	
	public static void simpleApproach(int[] nums) {
//		int zerocount = 0;
		int index = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 0) {
				continue;
			}
			swap(nums, index, i);
			index++;
		}
		System.out.println(Arrays.toString(nums));
	}
	
	private static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
}
